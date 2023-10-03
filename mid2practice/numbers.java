import java.io.*;

class Buffer {
    private int num = 0;

    synchronized void printOdd() {
        while (num % 2 == 0) {
            try {
                wait(); // Wait for even numbers to be printed
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
        }
        System.out.println(num++);
        notify(); // Notify waiting threads (in this case, the even number printing thread)
    }

    synchronized void printEven() {
        while (num % 2 != 0) {
            try {
                wait(); // Wait for odd numbers to be printed
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
        }
        System.out.println(num++);
        notify(); // Notify waiting threads (in this case, the odd number printing thread)
    }
}

class Numbers extends Thread {
    private final Buffer bRef;

    Numbers(Buffer b) {
        super();
        bRef = b;
        start();
    }

    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                System.out.print("run of main: ");
                bRef.printOdd();
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
        }
    }

    public static void main(String args[]) {
        Buffer mainBRef = new Buffer();
        Numbers mainTh = new Numbers(mainBRef);
        Child childTh = new Child(mainBRef);
        try {
            mainTh.join();
            childTh.join();
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }
    }
}

class Child extends Thread {
    private final Buffer bRef;

    Child(Buffer b) {
        super();
        bRef = b;
        start();
    }

    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                System.out.print("run of child: ");
                bRef.printEven();
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
        }
    }
}

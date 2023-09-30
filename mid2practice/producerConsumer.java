import java.io.*;
import static java.lang.System.out;
class producerConsumer {
  public static void main(String args[]) {
    buffer main_buf = new buffer();
    consumer c1 = new consumer(main_buf);
    producer p1 = new producer(main_buf);
    try {
      c1.join();
      p1.join();
    } catch (Exception e) {
      out.println(e.toString());
    }
  }
}
class buffer {
  int item;
  int flag = 0;

  buffer() {
    flag = 0;
  }

  synchronized void put(int a) {
    if (flag == 1) {
      try {
        wait();
      } catch (Exception e) {
        out.println(e.toString());
      }
    }
    flag = 1;
    item = a;
    notify();
  }

  synchronized int get() {
    if (flag == 0) {
      try {
        wait();
      } catch (Exception e) {
        out.println(e.toString());
      }
    }

    int temp = item;
    flag = 0;
    notify();
    return temp;
  }

}
class producer extends Thread {
  buffer b_ref;

  producer(buffer ref) {
    super();
    b_ref = ref;
    start();
  }

  public void run() {
    for (int i = 0; i < 3; i++) {
      try {
        b_ref.put(i);
        sleep(2000);
      } catch (Exception e) {
        out.print(e.toString());
      }
    }
  }

}
class consumer extends Thread {
  buffer b_ref;

  consumer(buffer ref) {
    super();
    b_ref = ref;
    start();
  }

  public void run() {
    for (int i = 0; i < 3; i++) {
      try {
        out.println(b_ref.get());
        sleep(2000);
      } catch (Exception e) {
        out.println(e.toString());
      }
    }
  }
}
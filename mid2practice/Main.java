import java.util.LinkedList;

// class Buffer {
//     private LinkedList<Integer> buffer = new LinkedList<>();
//     private int capacity;

//     public Buffer(int capacity) {
//         this.capacity = capacity;
//     }

//     public void produce(int item) throws InterruptedException {
//         synchronized (this) {
//             while (buffer.size() == capacity) {
//                 wait();
//             }
//             buffer.add(item);
//             System.out.println("Produced: " + item);
//             notifyAll();
//         }
//     }

//     public int consume() throws InterruptedException {
//         synchronized (this) {
//             while (buffer.isEmpty()) {
//                 wait();
//             }
//             int item = buffer.remove();
//             System.out.println("Consumed: " + item);
//             notifyAll();
//             return item;
//         }
//     }
// }
class Buffer {
  private LinkedList<Integer> buffer = new LinkedList<>();
  private int capacity;

  public Buffer(int capacity) {
    this.capacity = capacity;
  }

  public void produce(int item) throws InterruptedException {
    synchronized (this) {
      // Wait while the buffer is full
      while (buffer.size() == capacity) {
        wait(); // Use a loop to handle spurious wakeups
      }
      // Add the item to the buffer
      buffer.add(item);
      System.out.println("Produced: " + item);
      // Notify waiting consumers that a new item is available
      notifyAll();
    }
  }

  public int consume() throws InterruptedException {
    synchronized (this) {
      // Wait while the buffer is empty
      while (buffer.isEmpty()) {
        wait(); // Use a loop to handle spurious wakeups
      }
      // Remove and return the item from the buffer
      int item = buffer.remove();
      System.out.println("Consumed: " + item);
      // Notify waiting producers that space is available
      notifyAll();
      return item;
    }
  }
}

class Producer implements Runnable {
  private Buffer buffer;

  public Producer(Buffer buffer) {
    this.buffer = buffer;
  }

  @Override
  public void run() {
    try {
      for (int i = 1; i <= 5; i++) {
        buffer.produce(i);
        Thread.sleep(1000); // Simulate production time
      }
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }
}

class Consumer implements Runnable {
  private Buffer buffer;

  public Consumer(Buffer buffer) {
    this.buffer = buffer;
  }

  @Override
  public void run() {
    try {
      for (int i = 1; i <= 5; i++) {
        int item = buffer.consume();
        Thread.sleep(1500); // Simulate consumption time
      }
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }
}

public class Main {
  public static void main(String[] args) {
    Buffer buffer = new Buffer(3); // Change capacity as needed
    Thread producer1 = new Thread(new Producer(buffer));
    Thread producer2 = new Thread(new Producer(buffer));
    Thread consumer1 = new Thread(new Consumer(buffer));
    Thread consumer2 = new Thread(new Consumer(buffer));

    producer1.start();
    producer2.start();
    consumer1.start();
    consumer2.start();
  }
}

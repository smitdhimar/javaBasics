// this is the program to print numbers in the range of 0 to 100 in which all odd numbers will be displayed by mainthread and rest from child thread
import java.io.*;
import static java.lang.System.out;

class numbers extends Thread{
  int num=0;
  volatile flag=0;
  numbers() {
    super();
    start();
  }
  void print(){
    if(flag==0){
      try{
        wait();
      }
      catch(Exception e){
        out.println(e.toString());
      }
      
    }
  }
  public void run(){
     try{
       this.print();
       sleep(100);
     }
     catch(Exception e){
       out.println(e.toString());
     }
   } 
  public static void main(String args[]){
    numbers ch_th=new numbers();
    Thread 
    
  }
}
// class child extends Thread{
//   buffer b_ref;
//   child(buffer ref){
//     super();
//     b_ref=ref;
//     start();
//   }
//   public void run(){
    
//   }
// }
// class buffer{
//   int flag=0;
//   int num;
//   buffer(){
//     flag=0;
//   }
//   synchronized print(){
    
//   }
// }

// public class numbers {
//     private static final Object lock = new Object();
//     private static int number = 0;

//     public static void main(String[] args) {
//         Thread oddThread = new Thread() {
//             @Override
//             public void run() {
//                 while (number <= 100) {
//                     synchronized (lock) {
//                         if (number % 2 != 0) {
//                             System.out.println("Odd: " + number);
//                             number++;
//                         }
//                     }
//                 }
//             }
//         };

//         Thread evenThread = new Thread() {
//             @Override
//             public void run() {
//                 while (number <= 100) {
//                     synchronized (lock) {
//                         if (number % 2 == 0) {
//                             System.out.println("Even: " + number);
//                             number++;
//                         }
//                     }
//                 }
//             }
//         };

//         oddThread.start();
//         evenThread.start();

//         try {
//             oddThread.join();
//             evenThread.join();
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//     }
// }

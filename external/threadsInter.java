class myThread implements Runnable {
  public void run() {
    System.out.println("Thread is running...");
  }

  public static void main(String args[]){
    Thread th=new Thread(new myThread());
    th.start();
  }
}
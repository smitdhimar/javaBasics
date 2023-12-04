import java.lang.*;
import static java.lang.System.out;

class threadsClass extends Thread {
  int id;
  String name;

  threadsClass(int id, String name) {
    super(name);
    this.id = id;
    this.name = name;

    start();
  }

  public void run() {
    for (int i = 0; i < 3; i++) {
      try{
        this.sleep(2000);
      }
      catch(Exception e){out.println(e.toString());}
      out.println("thread running is " + this.id + " " + this.name + " iteration " + i);
    }
  }

  public static void main(String args[]) {
    threadsClass th1 = new threadsClass(1, "smit");
    threadsClass th2 = new threadsClass(2, "shiv");
  }
}
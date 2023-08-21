import java.io.*;
import java.util.Scanner;

class myException extends Exception {
  public static void main(String arg[]) {
    try {
      if (true)
        throw new myException("can't convert 12.3 to integer");
    } catch (myException e) {
      System.out.println(e.toString());
    }
    System.out.println("getting out");
  }

  myException(String msg) {
    super(msg);
    // System.out.println()
  }
}
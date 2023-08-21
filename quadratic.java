import java.io.*;
import java.util.Scanner;

public class quadratic {
  public static void main(String arg[]) {
    int a, b, c;
    Scanner ob = new Scanner(System.in);
    System.out.println("enter coeffiecients of equation a,b,c: ");
    a = ob.nextInt();
    b = ob.nextInt();
    c = ob.nextInt();
    try {
      int expr = (b * b) - (4 * a * c);
      if (expr < 0) {
        throw new Exception();
      }
      double r1 = (((-1) * b) + Math.sqrt(expr)) / (2 * a);
      double r2 = (((-1) * b) - Math.sqrt(expr)) / (2 * a);
      System.out.println("roots arr r1,r2: " + r1 + ", " + r2);
    } catch (Exception e) {
      System.out.println("complex roots possible");
    }
  }
}
import java.util.Scanner;

public class loopsInJava {
  // user input is also implemented here.
  public static void main(String args[]) {
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter the number of iterations: ");
    int n;

    n = ob.nextInt();
    for (int i = 0; i < n; i++) {
      System.out.println("printing for the " + (i + 1) + "th time");
      
    }
  }
}
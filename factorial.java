import java.util.Scanner;

public class factorial {
  public static void main(String args[]) {
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter the number to find it's factorial");
    int n = ob.nextInt();
    System.out.println(fact(n));
  }

  public static int fact(int n) {
    if (n > 0) {
      return n * fact(n - 1);
    } else {
      return 1;
    }

  }
}
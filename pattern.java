import java.io.*;

class pattern {
  public static void main(String arg[]) {
    int n = Integer.parseInt(arg[0]);
    for (int i = 0; i < n / 2 + 1; i++) {

      for (int j = 0; j < n; j++) {

        if (j == (n / 2) - i || j == (n / 2) + i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }

      }
      System.out.print("\n");

    }
    System.out.print(" ");
    for (int i = (n / 2) - 1; i >= 0; i--) {

      for (int j = 1; j < n; j++) {
        if (j == (n / 2) - i || j == (n / 2) + i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.print("\n ");

    }

  }

}
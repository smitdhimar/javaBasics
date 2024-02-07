limport java.net.*;
import java.io.*;

class server {
  private static String fibonacci(int a) {
    String ans = "1 1 ";
    int t1 = 0, t2 = 1, nextTerm = 0;
    while (nextTerm <= a) {
      t1 = t2;
      t2 = nextTerm;
      nextTerm = t1 + t2;
      ans += (String.valueOf(nextTerm) + " ");
    }
    return ans;
  }
  private static String prime(int a) {
    for (int i = 2; i < a / 2; i++) {
      if (a % i == 0)
        return "Not a prime number";
    }
    return "Prime number";
  }
  private static String factorial(int a) {
    String ans = "";
    int b = 1;
    while (a != 0) {
      b = b * (a--);
    }
    return String.valueOf(b);
  }
  private static String armstrong(int a) {
    int originalNum, result = 0;
    String num = String.valueOf(a);
    int numOfDigits = num.length();
    originalNum = a;
    while (originalNum != 0) {
      int remainder = originalNum % 10;
      result += Math.pow(remainder, numOfDigits);
      originalNum /= 10;
    }
    return result == a ? "yes" : "no";
  }
  public static void main(String arg[]) {
    try {
      ServerSocket ss = new ServerSocket(1025);
      Socket s = ss.accept();
      BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
      PrintStream pout = new PrintStream(s.getOutputStream());
      String input = br.readLine();
      switch (input) {
        case "1":
          pout.println("enter number for fibonacci: ");
          int a = Integer.parseInt(br.readLine());
          pout.println(fibonacci(a));
          break;
        case "3":
          pout.println("enter number for factorial: ");
          int b = Integer.parseInt(br.readLine());
          pout.println(factorial(b));
          break;
        case "2":
          pout.println("enter number for armstrong: ");
          int c = Integer.parseInt(br.readLine());
          pout.println(armstrong(c));
          break;
        case "4":
          pout.println("enter number to check whether it is prime or not");
          int d = Integer.parseInt(br.readLine());
          pout.println(prime(d));
        case "5":
          pout.println("bye");
          break;
      }
      pout.close();
      br.close();
      s.close();
      ss.close();
    } catch (Exception e) {
      System.out.println(e.toString());
    }
  }
}
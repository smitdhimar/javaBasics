import static java.lang.System.out;

class myException extends Exception {
  myException(String str) {
    super(str);

  }

  public static void main(String args[]) {
    try {
      int n = Integer.parseInt("dkj");
    } catch (Exception e) {
      out.println(e.toString());
    }
  }
}
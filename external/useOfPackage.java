import p1.addition;

class useOfPackage {
  public static void main(String args[]) {
    int a = 234;
    int b = 232;
    addition ob = new addition(a, b);
    System.out.println(ob.add());
  }
}
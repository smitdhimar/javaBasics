import calc.subtraction;
import calc.addition;

class myCalculations {
  public static void main(String args[]) {
    addition add = new addition(23, 23);
    System.out.println(add.getSum());
    subtraction sub=new subtraction(34,23);
    System.out.println(sub.getRes());
  }
}
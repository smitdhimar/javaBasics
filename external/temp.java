class A_citizen {
  protected String name;

  public A_citizen(String s) {
    name = s;
  }

  protected String getName() {
    return name;
  }

  public void report() {
    System.out.println("I am " + name);
  }
}

public class temp extends A_citizen {
  public String name;

  public temp(String alias, A_citizen c) {
    super(c.name);
    this.name = alias;
  }

  public static void main(String args[]) {
    A_citizen oldme = new A_citizen("Mugambo");
    temp newme = new temp("sdfj;asdj", oldme);

    newme.report();

  }
}

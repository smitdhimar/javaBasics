import java.io.*;
import java.util.Scanner;

class books {
  String title;
  String author;

  books() {
    this.title = "";
    this.author = "";
  }

  books(String a, String b) {
    this.title = a;
    this.author = b;
  }
}

class details extends books {
  public int price;
  public int stock;

  details() {
    super();
  }

  details(String s1, String s2, int p, int s) {
    super(s1, s2);
    this.price = p;
    this.stock = s;
  }

  String getBook() {
    return super.title;
  }

  int getPrice() {
    return this.price;
  }

  void update(int a, int b) {
    this.price = a;
    this.stock = b;
  }

  void display() {
    System.out.println(super.title + " " + super.author + " " + this.price + " " + this.stock);
  }
}

class bookInheritance {
  public static void main(String arg[]) {
    details[] obarr = new details[4];
    obarr[0] = new details("maktub", "paulo cohelo", 200, 45);
    obarr[1] = new details("The girl in room 105", "Chetan bhagat", 154, 40);
    obarr[2] = new details("The alchemist", "paulo cohelo", 250, 10);
    obarr[3] = new details("ikigai", "N/A", 195, 15);
    System.out.println("Title                  Author             price  stock");
    for (int i = 0; i < 4; i++)
      obarr[i].display();
    Scanner ob = new Scanner(System.in);
    System.out.println("Search for the book:");
    String sbook = ob.nextLine();
    int i;
    for (i = 0; i < 4; i++) {
      String str = obarr[i].getBook();
      if (str.equals(sbook) == true) {
        break;
      }
    }
    System.out.println("found book, now update values for price and stock:");
    int sprice = ob.nextInt();
    int sstock = ob.nextInt();
    obarr[i].update(sprice, sstock);
    System.out.println("Title                  Author             price  stock");
    for (
      i = 0; i < 4; i++)
      obarr[i].display();

  }
}
import java.io.*;
import static java.lang.System.out;

class inhertance {
  public static void main(String args[]) {
    other_details ob[] = new other_details[4];
    // ob[0] = new student();
    ob[0] = new other_details("maktub", "cohelo", 54, 10);
    ob[1] = new other_details("maktub", "cohelo", 37, 10);
    ob[2] = new other_details("maktub", "cohelo", 25, 10);
    ob[3] = new other_details("maktub", "cohelo", 57, 10);
    for (int i = 0; i < 4; i++) {
      if (ob[i].getPrice() < 30) {
        ob[i].display();
      }
    }
  }
}

class book {
  String title;
  String author;

  book(String s1, String s2) {
    title = s1;
    author = s2;
  }

  void display() {
    out.println(title + "\n");
    out.println(author + " \n");
  }
}

class other_details extends book {
  int price;
  int copies;

  other_details(String s1, String s2, int p, int c) {
    super(s1, s2);
    this.price = p;
    this.copies = c;

  }

  int

      getPrice() {
    return price;
  }

  void display() {
    super.display();
    out.println(price + "\n");
    out.println(copies + "\n");
  }
}
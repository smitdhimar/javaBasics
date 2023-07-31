import java.io.*;
import java.util.*;

class linkedList {

  public static void main(String args[]) {
    list root = new list(Integer.parseInt(args[0]));
    for (int i = 1; i < args.length; i++) {
      try {
        int a = Integer.parseInt(args[i]);
        root.append(a);
      } catch (NumberFormatException e) {
        System.out.println("Argument provided at index " + i + " is not a valid integer");
      }
    }
    root.traverse();
    int found = root.search(5);
    System.out.println("element 5 found at index " + found);
  }

}

class list {
  int a;
  list next;

  public list(int a) {
    this.a = a;
    next = null;
  }

  public void append(int val) {
    list newnode = new list(val);

    list tp = this;
    while (tp.next != null) {
      tp = tp.next;
    }
    tp.next = newnode;
  }

  public void traverse() {
    list tp = this;
    while (tp != null) {
      System.out.print(tp.a + " ");
      tp = tp.next;
    }
    System.out.println();
  }

  public int search(int val) {
    int flag = 1, i = 0;
    list tp = this;
    while (tp != null) {

      if (tp.a == val) {
        flag = 0;
        return i;
      }
      tp = tp.next;
      i++;
    }
    return -1;
  }

}
import java.io.*;
import java.util.Scanner;

class linkedList {
  public static void main(String args[]) {
    list root = new list(5);
    root.append(12);
    root.append(1);
    root.append(23);
    root.append(23);
    root.append(12);
    root.append(45);
    root.display();
    System.out.println();
    root.sort();
    root.display();
  }
}

class list {
  int val;
  list next;

  list() {
    this.val = 0;
    this.next = null;
  }

  list(int a) {
    this.val = a;
    this.next = null;
  }

  void sort()
  {
    list outerTP = this;
list innerTP;

while (outerTP != null) {
    innerTP = outerTP.next;

    while (innerTP != null) {
        if (innerTP.val < outerTP.val) {
            // Swap nodes, not just values
            list temp = outerTP.next;
            outerTP.next = innerTP.next;
            innerTP.next = temp;

            // Update outerTP and innerTP after swapping
            temp = outerTP;
            outerTP = innerTP;
            innerTP = temp;
        }
        innerTP = innerTP.next;
    }
    outerTP = outerTP.next;
}
  }

  void append(int a) {
    list newnode = new list(a);
    if (this.next == null) {
      this.next = newnode;
      return;
    }
    list tp = this;
    while (tp.next != null) {
      tp = tp.next;
    }
    tp.next = newnode;
    newnode = null;
  }

  void display() {
    list tp = this;
    while (tp != null) {
      System.out.print(tp.val + " ");
      tp = tp.next;
    }
    tp = null;
  }
  // void insert(int val,int i)
  // {
  // list newnode=new list(val);
  // int itr=0;
  // list tp=this;
  // while(itr!=i || tp!=null)
  // {
  // tp=tp.next;
  // itr++;
  // }

  // }
}
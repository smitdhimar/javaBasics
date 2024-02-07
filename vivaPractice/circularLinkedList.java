import java.io.*;

public class circularLinkedList {
  node head;

  circularLinkedList() {
    this.head = null;
  }

  void traverse() {
    node temp = head;
    while (temp.next != head) {
      System.out.println(temp.val);
      temp = temp.next;
    }

  }

  // void append(int a) {
  // node newnode = new node(a);
  // if (head == null) {
  // head = newnode;
  // head.next = head;
  // return;
  // }
  // if (head.next == head) {
  // head.next = newnode;
  // newnode.next = head;
  // return;
  // }
  // node temp = head;
  // while (temp.next != head) {
  // temp = temp.next;
  // }
  // temp.next = newnode;
  // newnode.next = head;

  // }

  void append(int a) {
    node newnode = new node(a);
    if (head == null) {
      head = newnode;
      head.next = head; // Set the next of the only node to itself to make it circular
      return;
    }
    if (head.next == head) {
      head.next = newnode;
      newnode.next = head;
      return;
    }
    node temp = head;
    while (temp.next != head) {
      temp = temp.next;
    }
    temp.next = newnode;
    newnode.next = head;
  }

  public static void main(String args[]) {

    circularLinkedList ob = new circularLinkedList();
    ob.append(2);
    ob.append(3);
    ob.append(32);
    ob.append(32);
    ob.append(32);
    ob.append(32);
    ob.traverse();
  }
}

class node {
  int val;
  node next;

  node(int a) {
    this.val = a;
    this.next = null;
  }
}
// public class
import static java.lang.System.out;

class LinkedList {
  int val;
  LinkedList next;

  LinkedList() {
    this.val = 0;
    this.next = null;
  }

  LinkedList(int val) {
    this.val = val;
    this.next = null;
  }

  void insert(int a) {
    LinkedList newnode = new LinkedList(a);
    if (this == null) {
      this = newnode;
      return;
    }
    if (this.next == null) {
      if (this.val > a) {
        this.next = newnode;

      } else {
        LinkedList temp = this;
        this = newnode;
        this.next = temp;

      }
      return;
    }
    LinkedList tp = this;
    while (tp != null && tp.val > a) {
      prev = tp;
      tp = tp.next;
    }
    if (prev == null) {
      newnode.next = tp;
      this = newnode;
    } else if (tp != null) {
      prev.next = newnode;
      newnode.next = tp;
    } else {
      prev.next = newnode;
    }

  }

  // display
  void display() {
    LinkedList cur = this;
    LinkedList prev = null;
    while (cur != null) {
      out.println(cur.val);
      cur = cur.next;
    }
  }
}

class LinkedListSorting {
  public static void main(String args[]) {
    LinkedList root = new LinkedList();
    root.insert(45);
    root.insert(46);
    root.insert(373);
    root.display();
  }

}

// import org.junit.rules.ExpectedException;
import java.io.*;

class stackpop {
  public static void main(String arg[]) {
    stack st = new stack();
    st.push(12);
    st.push(1);
    int n = 3;
    while (n > 0) {
      try {
        st.pop();
        System.out.println(n);
      } catch (Exception e) {
        System.out.println("there sas a problem");
      }
      n--;
    }
  }
}

class stack {
  int tos = -1;
  int arr[];

  stack() {
    this.arr = new int[1000];
  }

  void push(int a) {
    arr[++tos] = a;
  }

  int pop() throws Exception {
    try {
      if (tos == -1)
        throw new Exception();
      return arr[tos--];
    } catch (Exception e) {
      throw e;
    }
  }

}
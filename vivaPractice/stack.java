public class stack {
  int[] arr;
  int tos = -1;

  stack() {
    arr = new int[1000];
  }

  void push(int x) {
    arr[++tos] = x;
  }

  int pop() throws Exception {
    return arr[tos--];
  }

  public static void main(String args[]) {
    stack ob = new stack();
    ob.push(23);
    ob.push(234);
    // cout<<ob.pop();
    // cout<<endl;
    try {
      System.out.println(ob.pop());
      System.out.println(ob.pop());
      ob.pop();
    } catch (Exception e) {
      System.out.println("under flow ");
    }
  }
}
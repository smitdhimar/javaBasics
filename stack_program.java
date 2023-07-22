import java.util.Scanner;
import java.io.*;
class stack_program{
  public static void main(String arg[])
 {
   Scanner ob=new Scanner(System.in);
   int  ch;
   int n;
System.out.print("Enter size of stack:");   
   n=ob.nextInt();   
   stack st=new stack(n);
   
do{
    System.out.println("1: push");
    System.out.println("2: pop");     
    System.out.println("3: display");
    ch=ob.nextInt();
    switch(ch)
  {
  case 1:
     System.out.print("enter value: ");
     int val=ob.nextInt();
     st.push(val);
     break;
  case 2:
     st.pop();
     break;
  case 3:
     st.display();
     break;
  default:
     break;

  }


   }while(ch!=-1);

 }
}

class stack{
  int len;
  int top=-1;
  int st[];
  stack(int len)
{
  this.len=len;
  this.st=new int[len];
}
  void push(int a)
 {
  if(top==len)
   {
     System.out.println("Stack overflow");
     return;
   }
  st[++top]=a; 
 }
  int pop()
{
  if(top<0)
  {
     System.out.println("Stach underflow");
     return -1;
  }
  else{
      return st[top--]  ;

   }   

}

 void display()
{
  for(int i=0;i<top+1;i++)
  {
    System.out.println(st[i]);
  }
}
}
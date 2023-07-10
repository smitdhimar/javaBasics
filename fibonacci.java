import java.io.*;
public class fibonacci
{
  public static void main(String arg[])
   { 
     int a=Integer.parseInt(arg[0]);
     int b=Integer.parseInt(arg[1]);
     fibo(a,b); 
   }
   static void fibo(int a,int b)
   {
int t1=0,t2=1,nextTerm=0;
     while(nextTerm<=b)
     { 
       if(nextTerm>=a && nextTerm<=b)
       { 
          System.out.println(nextTerm+ " ");
       }
       t1=t2;
       t2=nextTerm;
       nextTerm=t1+t2;
     }
     
   }
}
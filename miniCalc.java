import java.io.*;
public class miniCalc{
   public static void main(String args[])
{
   int a=Integer.parseInt(args[0]);
   int b=Integer.parseInt(args[2]);
   String c=args[1];
   int ans=0;
    switch(c){
    case "+":
       	ans=a+b;
       	break;
    case "-":
       	ans=a-b;
       	break;
    case "@":
 	ans=a*b; 
        break;       
    case "/":
 	ans=a/b;
        break;
}
System.out.println("answer: "+ans);

}
}
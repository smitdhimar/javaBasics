import java.io.*;
import java.util.Scanner;
class pattern{
   public static void main(String arg[])
   {
    Scanner inp=new Scanner(System.in);
     System.out.println("Enter char:");
     char ch=inp.next().charAt(0);
     int val=ch;
     int index;
    if(val>=65&&val<=90)
    {
     index=val-65;
    
     int m=7/2;
     for(int i=0;i<=3;i++)
     {
     for(int j=3;j>i;j--)
     {
      System.out.print(" ");
}
if(i%2==0)
{
     for(int k=0;k<=i;k++)
     {
      System.out.print((char)(65+index++)+" ");
    if(index>25)
      {
            index=index-26;
      }
}
}else{
      for(int k=0;k<=i;k++)
     {
      System.out.print((char)(97+index++)+" ");
    if(index>25)
      {
            index=index-26;
      }
}
}
      System.out.println();
}
    }else{
        index=val-97;
    
     int m=7/2;
     for(int i=0;i<=3;i++)
     {
     for(int j=3;j>i;j--)
     {
      System.out.print(" ");
}
if(i%2==0)
{
     for(int k=0;k<=i;k++)
     {
      System.out.print((char)(97+index++)+" ");
      if(index>25)
      {
            index=index-26;
      }
}
}else{
      for(int k=0;k<=i;k++)
     {
      System.out.print((char)(65+index++)+" ");
   if(index>25)
      {
            index=index-26;
      }
}
}
      System.out.println();
}
    }
}
}
import java.io.*;

class exception_handling {

 public static void main(String args[])
   {
      try{
           	  int a =Integer.parseInt(args[0]);
                  System.out.println("a="+a);
             	
         }
      catch(NumberFormatException e)
{
    System.out.println("Provide correct integer value");
}

   }

}
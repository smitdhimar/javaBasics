import java.io.*;
import java.util.Scanner;

public class intSum{
	public static void main(String args[])
	{
	Scanner ob=new Scanner(System.in);
 	int n=ob.nextInt();
       int sum=0;
        while(n!=0){
		try{
		  if(n>1000 || n<(-1000)){throw new Exception();}
 		else{sum+=n;}
		}
		catch(Exception e){
		System.out.println("Out of range");
		}
		n=ob.nextInt();

	}	
	System.out.println("total sum is : " + sum);
	}
}
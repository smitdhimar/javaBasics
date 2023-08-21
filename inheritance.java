import java.io.*;
import java.util.Scanner;
class parent{
	protected String title;
	protected String author;
	parent(String a,String b)
	{
	  this.title=a;
	  this.author=b;
	}	
}
class child extends parent{
protected int price;
protected int copies;
child(int a,int b,String s1,String s2)
{
	super(s1,s2);	
	this.price=a;
	this.copies=b;	
}
void display(){
	System.out.println("BOOK DETAILS \n Title: "+super.title+" \n Author:"+super.author+"\n Price:"+this.price+"\n Copies:"+this.copies);
	}
void update(int a,int b){
this.price+=a;
this.copies+=b;	
}
}
public class inheritance{
	
	public static void main(String args[])
	{
    Scanner ob=new Scanner(System.in);
	child c1=new child(45,10,"The alchemist","paolo cohelo");
	c1.display();
	System.out.println("Enter update values +/- values of price and copies");	
	int a=ob.nextInt();
	int b=ob.nextInt();
 	c1.update(a,b);
    System.out.println("updated to__");
  c1.display();
}
}
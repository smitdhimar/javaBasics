import java.io.*;
import java.util.Scanner;
class parent{
	public String title;
	public String author;
	parent(String a,String b)
	{
	  this.title=a;
	  this.author=b;
	}	
}
class child extends parent{
public int price;
public int copies;
child(int a,int b,String s1,String s2)
{
	super(s1,s2);	
	this.price=a;
	this.copies=b;	
}
void display(){
	System.out.println("BOOK DETAILS \n Title: "+super.title+" \n Author:"+super.author+"\n Price:"+this.price+"\n Copies:"+this.copies);
	}


}
public class inheritance{
	public static void main(String args[])
	{
	child c1=new child(45,10,"The alchemist","paolo cohelo");
	c1.display();	
}
}
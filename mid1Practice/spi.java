import java.io.*;
import java.util.Scanner;
class students{
  public String name;
  public String id;
  students()
  {
    this.name="";
    this.id="";
  }
  students(String s1,String s2)
  {
    this.name=s1;
    this.id=s2;
  }
}
class details extends students{
  public int rank;
  public int per;
  details(){
    super();
  }
  details(String s1,String s2,int r,int s)
  {
    super(s1,s2);
    this.rank=r;
    this.per=s;
  }
  void display()
  {
    System.out.println("Details: \n  "+super.id+"\n  "+super.name+"\n  "+this.rank+"\n  "+this.per);

  }
}
class spi{
  public static void main(String arg[])
  {
    
  }
}
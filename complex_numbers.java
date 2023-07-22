import java.io.*;

public class complex_numbers{
       public static void main(String arg[])
{
     int a =Integer.parseInt(arg[0]);
     int b =Integer.parseInt(arg[1]);
     int d =Integer.parseInt(arg[3]);
     int e =Integer.parseInt(arg[4]);
     complex ob1=new complex(a,b);
     complex ob2=new complex(d,e);

     complex res=ob1.add_complex(ob2);       
     res.display();
}
}

class complex{
  private int r;
  private int i;
  complex(){
   this.r=this.i=0;
}
complex(int a,int b)
{
  this.r=a;
  this.i=b;

}
complex add_complex(complex a){
  complex result=new complex(this.r+a.r,this.i+a.i);
  return result;
}
void display(){
  System.out.println("complex number is : "+this.r+"+"+this.i+"i");

}
}
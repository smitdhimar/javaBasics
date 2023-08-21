import static java.lang.System.out;
import java.io.*;
import java.util.Scanner;

class myException extends Exception{
    myException(String s){
        super(s);
    }
}
class rankFilter{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        out.println("Enter number of students: ");
        int n=ob.nextInt();
        student obarr[]=new student[n];
        for(int i=0;i<n;i++)
    {
        out.println("Enter IDno and rank: ");
        String idno=ob.next();
        int a=ob.nextInt();
        obarr[i]=new student(idno,a);
    }
    out.println("enter range of ranks to get student details: ");
    int r1=ob.nextInt();
    int r2=ob.nextInt();
    try{
        if(r1>r2 || r1<=0 || r2<=0 || r2>n) throw new myException("Enter valid range of ranks");
        out.println("Details of student in range "+r1+" to "+ r2);
            out.println("NAME        RANK");
            
        for(int i=0;i<n;i++)
        {
            if(obarr[i].getRank()>=r1 && obarr[i].getRank()<=r2)
            {
                obarr[i].display();
            }
        }
    }
    catch(myException e){
        out.println(e.toString());
    }
    }
}
class student{
    String idno;
    int rank;
    student(){
        idno="";
        rank=0;
    }
    student(String s,int a){
        this.idno=s;
        this.rank=a;
    }
    int getRank()
    {
        return this.rank;
    }
    void display()
    {
        out.println(this.idno+"     "+this.rank);
    }
}

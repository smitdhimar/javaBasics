import java.io.*;
import static java.lang.System.out;

class mainThread{
    public static void main(String args[]){
        child_thread ch1=new child_thread("child 1",1,"message for child thread 1");
        child_thread ch2=new child_thread("child 2",2,"message for child thread 2");
        child_thread ch3=new child_thread("child 3",3,"message for child thread 3");
        for(int i=0;i<3;i++){
            try{
                out.print("from main method");
                Thread.sleep(3000);
            }
            catch(Exception e){
                out.print("interrupted Exception from main "+e.toString() );
            }
        }
        try{
            ch1.join();
            ch2.join();
            ch3.join();
        }
        catch(Exception e){
            out.println("join Exception: "+e.toString());
        }
    }
}

class child_thread extends Thread{
    String msg;
    int id;
    child_thread(String name,int id,String s){
        super(name);
        this.id=id;
        this.msg=s;
        start();
    }
    public void run() {
        for(int i=0;i<3;i++){
            try{
                out.println("\nId: "+this.id+"\nMessage: "+this.msg);
                Thread.sleep(1000);
            }
            catch(Exception e){
                out.println("interrupted Exception: "+ e.toString());
            }
        }
    }
}
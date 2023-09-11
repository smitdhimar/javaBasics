import java.util.*;
import java.io.*;
import static java.lang.System.out;
class IOprogram3{
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        out.println("enter file from which you want to take input: ");
        String source=ob.next();
        // try{
            File dir=new File("E:/java");
        
        

    try{
        File files[]=dir.listFiles();
        File f2=new File("E:/java/newtextfile.txt");
        for(File str: files){
            String temp=str.getName();
            out.println(temp);
            if(temp.equals(source)) {
                copyFile(str,f2);
                break;
            }
            // else out.println("File does not exists");
        
        }
       
        }
         catch(Exception e){out.println("caught some errors");}
        
    }
    public static void  copyFile(File f1,File f2){
        try{FileInputStream fin=new FileInputStream("E:/java/"+f1.getName());
        FileOutputStream fout=new FileOutputStream("E:/java/"+f2.getName());
        // int i=fin.read();
        int i;
        while((i = fin.read())!=-1 ){
            fout.write((char) i);
        }}
        catch(Exception e){
            out.println("There is error in copying file..");
        }
    }
}
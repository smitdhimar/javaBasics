import java.util.*;
import java.io.*;
import static java.lang.System.out;
class ioImplementation {
    public static void main(String arg[]) throws IOException{
        // FileWriter ob=new FileWriter("C:/Users/Student/Documents/21cp039/textfile.txt");
        // ob.write("hello world");
        // ob.close();
        // FileReader readerob= new FileReader("C:/Users/Student/Documents/21cp039/textfile.txt");
        // int character;
        // while((character=readerob.read())!=-1){
        //     out.print((char) character);
        // }
        // readerob.close();
        Scanner ob=new Scanner(System.in);
        FileWriter writer=new FileWriter("/home/runner/javaBasics/textfile.txt");
        int n=3;
        out.println("Enter details of 3 students: ");
        while(n!=0){
            out.println("enter following details-(id,name,contact,cpi)");
            String id = ob.next();
            String name= ob.next();
            String contact=ob.next();
            String cpi=ob.next();
            writer.write(id+" "+name+" "+contact+" "+cpi+"\n");
            n--;
        }
        writer.close();

        out.println("Enter ID for searching..");
        String id=ob.next();
        BufferedReader br= new BufferedReader(new FileReader("/home/runner/javaBasics/textfile.txt"));
        String temp;
        while((temp=br.readLine())!=null){
            if(id.equals(temp.substring(0,2))){
                out.println(temp);
            }
        }
    }
}
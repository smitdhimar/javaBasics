import java.io.*;
import static java.lang.System.out;
// import java.util.*;

class IOprogram4{
    public static void main(String arg[]){
        try{
            PrintWriter f4=new PrintWriter("E:/java/newtextfile.txt");
            for(int i=1;i<=3;i++){
                String s="E:/java/textfile"+i+".txt";
                BufferedReader br=new BufferedReader(new FileReader(s));
                CharSequence csq;
                while((csq=br.readLine())!=null){
                    csq=csq+"\n";
                    f4.append(csq);
                    f4.flush();
                }
                br.close();
            }
            f4.close();
        }
        catch(Exception e){
            out.println("there was some problem");
        }
    }
}

//problem statement
//ask user to enter 2 file names out of four options 
//append the data of both of them to the new file
import java.io.*;
import java.util.*;
import static java.lang.System.out;

class appendFileData {
  public static void append(File fi, PrintWriter pw) throws Exception {
    String str = fi.getName();
    BufferedReader bf = new BufferedReader(new FileReader("/home/runner/javaBasics/external/" + str));
    CharSequence csq;
    while ((csq = bf.readLine()) != null) {
      pw.append(csq);
      pw.flush();
    }
  }

  public static void main(String args[]) {
    Scanner ob = new Scanner(System.in);
    String a;
    String b;
    out.println("Enter file names to be appended in new file: \n");
    a = ob.next();
    b = ob.next();
    try {
      File f = new File("/home/runner/javaBasics/external/");
      PrintWriter pw = new PrintWriter("/home/runner/javaBasics/external/myOPFile.txt");
      File[] files = f.listFiles();
      for (File fr : files) {
        String temp = fr.getName();
        if (a.equals(temp) || b.equals(temp)) {
          append(fr, pw);
          
        }
        // f.close();
        
      }
      pw.close();

    } catch (Exception e) {
      out.println(e.toString());
    }
  }
}
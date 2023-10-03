import java.io.*;

class inputStreamAndOutputStream{
  public static void main(String args[]){
    try{ FileInputStream fi=new FileInputStream("/home/runner/javaBasics/mid2practice/inputfile.txt");
        FileOutputStream fo=new FileOutputStream("/home/runner/javaBasics/mid2practice/outputfile.txt");
    // int i=fi.read();
    int i;
    while((i=fi.read())!=-1){
      // System.out.print((char) i);
      fo.write(i);
    }
        fi.close();
        fo.close();
       }
    catch(Exception e){
      System.out.println(e.toString());
    }
  }
}
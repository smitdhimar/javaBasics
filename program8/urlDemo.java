import java.net.*;  
import java.io.*;
import static java.lang.System.out;
public class urlDemo{  
public static void main(String[] args){  
try{  
URL url=new URL("https://nextjs.org/docs");  

out.println("Protocol: "+url.getProtocol());  
out.println("Host Name: "+url.getHost());  
out.println("Port Number: "+url.getPort());  
out.println("File Name: "+url.getFile());  

}catch(Exception e){
  out.println(e);
}  
}  
}  
import java.io.*;
import java.net.*;
import static java.lang.System.out;

class server{
  public static void main(String args[]){
    try{DatagramSocket server=new DatagramSocket(1025);
    byte[]  receiveBuf=new byte[512];
    DatagramPacket receivePack=new 
    DatagramPacket(receiveBuf,receiveBuf.length);
        server.receive(receivePack);
    String inputFileName=new String(receiveBuf).trim();
        out.println(inputFileName);
    File f=new File("/home/runner/javaBasics/program7/"+inputFileName);
         String sendingString="";
        if(f.exists()){

          String mainStr="/home/runner/javaBasics/program7/"+inputFileName;
BufferedReader br=new BufferedReader(new FileReader(mainStr));
          String temp;
         
          while((temp=br.readLine())!=null){
            sendingString+=temp;
          }
         
          br.close();
        }
        else{
          sendingString="file does not exists";
        }
        DatagramPacket sendPack=new DatagramPacket(sendingString.getBytes(),sendingString.length(),InetAddress.getByName("localhost"),1026);
        server.send(sendPack);

        // f.close();
        // receivePack.close();
        server.close();
    }catch(Exception e){
      out.println(e.toString());
    }
  }
}
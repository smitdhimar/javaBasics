import java.io.*;
import java.net.*;
import static java.lang.System.out;
class client{
  public static void main(String args[]){
    try{
      DatagramSocket clientSocket=new DatagramSocket(1025);
      InetAddress ip=InetAddress.getByName("localhost");

      byte[] receiveBuf=new byte[1024];
      byte[]  sendBuf=new byte[1024];
      String ipString="helllo bhavesh sir ";
      // out.println("hello");
      sendBuf=ipString.getBytes();
      DatagramPacket sendPack=new DatagramPacket(sendBuf,ipString.length(),ip,1026);
      clientSocket.send(sendPack); 
    DatagramPacket receivePack=new DatagramPacket(receiveBuf,receiveBuf.length);
      
      clientSocket.receive(receivePack);
           String ans=new String(receiveBuf);
      out.println(ans);
    }catch(Exception e){
      out.println(e.toString());
    }
  }
}
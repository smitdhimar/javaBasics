import java.io.*;
import java.net.*;
import static java.lang.System.out;
class server{
  public static void main(String args[]){
    try{
      DatagramSocket server=new DatagramSocket(1026);
      InetAddress ip=InetAddress.getByName("localhost");
      byte[]  sendBuf=new byte[1024];
      byte[]  receiveBuf=new byte[1024];
      DatagramPacket receivePack=new DatagramPacket(receiveBuf,receiveBuf.length);
      server.receive(receivePack);
      String str=new String(receiveBuf);
      str=str.toUpperCase();

      sendBuf=str.getBytes();
      DatagramPacket sendPack=new DatagramPacket(sendBuf,str.length(),ip,1025);
      server.send(sendPack);
      
      
    }catch(Exception e){
      out.println(e.toString());      
    }
  }
}
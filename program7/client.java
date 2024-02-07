import java.io.*;
import java.net.*;
import static java.lang.System.out;

class client{
  public static void main(String args[]){
    try{ String inputString;
        out.println("enter file name: ");
        BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
        inputString=stdin.readLine();
    DatagramSocket client=new DatagramSocket(1026);
    DatagramPacket sendPack=new DatagramPacket(inputString.getBytes(),inputString.length(),InetAddress.getByName("localhost"),1025);
    client.send(sendPack);
    byte[]  receiveBuf=new byte[512];
    DatagramPacket receivePack=new DatagramPacket(receiveBuf,receiveBuf.length);
    client.receive(receivePack);

    String ans=new String(receiveBuf);
    out.println(ans);
    client.close();}
    catch(Exception e){
      out.println(e.toString());
    }
  }
}
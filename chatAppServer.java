import java.io.*;
import java.net.*;
import static java.lang.System.out;

class chatAppServer{
public static void main(String args[]){
    try{
	Socket s;
	ServerSocket myServer=new ServerSocket(777);
	s=myServer.accept();
	BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
	PrintStream pout=new PrintStream(s.getOutputStream());
	BufferedReader fromStdin=new BufferedReader(new InputStreamReader(System.in));
	
	while(true){
		String str=br.readLine();
		if(str.equalsIgnoreCase("bye")){ 
			pout.println("bye");
			break;
		}
		System.out.print("client:");
		out.println(str);
		String temp=fromStdin.readLine();
	
		pout.println(temp);
    }
	fromStdin.close();
	pout.close();
	br.close();
	myServer.close();
	s.close();

}catch(Exception e){
	out.println(e.toString());
}
}
}
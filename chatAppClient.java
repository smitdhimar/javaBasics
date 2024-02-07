import java.io.*;
import java.net.*;
class chatAppClient{

public static void main(String args[]){
try{
	Socket s=new Socket("localhost",777);
	BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
	BufferedReader stdout=new BufferedReader(new InputStreamReader(s.getInputStream()));
	PrintStream pout=new PrintStream(s.getOutputStream());
	while(true){
		System.out.print("cilent:");
		String StrFromStdin=stdin.readLine();	
		pout.println(StrFromStdin);
		String StrFromStdout=stdout.readLine();
		System.out.println(StrFromStdout);
		if(StrFromStdout.equalsIgnoreCase("bye")){
			break;
		}
	}
	pout.close();
	stdout.close();
	stdin.close();
	s.close();
	
}catch(Exception e){
	System.out.println(e.toString());	
}
}}

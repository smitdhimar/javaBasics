import java.net.*;
import java.io.*;
class client{
	public static void main(String args[]){
	try{
	Socket s=new Socket("localhost",1025);
	BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
	BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("1: fibonacci \n2: Armstrong\n3: Factorial  \n4: prime \n5:exit");
	String inputFromStdin=stdin.readLine();
	PrintStream pout=new PrintStream(s.getOutputStream());
	pout.println(inputFromStdin);
	String ans=br.readLine();	
	System.out.println(ans);
	String choice=stdin.readLine();
	pout.println(choice);
	while(true){
	ans=br.readLine();
	if(ans=="bye" || ans==null) break;
	System.out.println(ans);
	}
	pout.close();
	stdin.close();
	br.close();
	s.close();	
}
catch(Exception e){
	System.out.println(e.toString());
}
}
}
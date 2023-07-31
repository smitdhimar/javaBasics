import java.io.*;
class my_stack{
 public static void main(String args[])
 {
  stack st= new stack(); 
  for(int i=0;i<args.length;i++)
  {
     if(true==args[i].equals("push"))
    {
        st.push(Integer.parseInt(args[i+1]));
        i++;
    }   
     else if(args[i].equals("pop")==true)
    { 
          st.pop();
    }  
  }
    st.display();
  
 }
 
}
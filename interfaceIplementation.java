import java.io.*;
import static java.lang.System.out;

interface player{
     int id=10;
    void display();
}
interface captain{

    String name="smit dhimar";
    void display();
}
class composite implements player, captain{
    composite(){}
   public void display(){
        out.println("ID: "+id+" name: "+name);
    }
}

class interfaceIplementation{
    public static void main(String args[]){
        composite myOBJ = new composite();
        myOBJ.display();
    }
}
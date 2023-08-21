import java.io.*;
import java.util.*;
import static java.lang.System.out;

class data_structure{
    int arr[];
    int len;
    data_structure(int a){
        this.len=a;
        this.arr=new int[a];
    }
    void get_data(){

    }
    void put_data(){
    // for(int i=0;i<len;i++)
        // out.println(arr[i]+" ");
    }
}

class stack extends data_structure{
int tos=-1;
stack(int len)
{
    super(len);
}
void get_data(int a){
    push(a);
}
int pop(){
    return super.arr[tos--];
}
void push(int a){
    super.arr[++tos]=a;
}
void put_data()
{
    out.println("For stack: ");
    for(int i=0;i<=tos;i++)
        out.println(arr[i]+" ");
}
}

class queue extends data_structure{
int front;
int back;
queue(int len)
{
    super(len);
}
void get_data(int a){
    super.arr[++back]=a;
}
int pop_back(){
    return super.arr[back--];
}
void put_data()
{
    out.println("For queue: ");
    for(int i=front;i<back;i++)
        out.println(arr[i]+" "); 
}
}

class stackAndQueue{
    public static void main(String args[]){
        stack st=new stack(100);
        queue q=new queue(100);
        st.get_data(5);
        st.get_data(6);
        st.get_data(2);
        st.pop();
        st.put_data();
        q.get_data(2);
        q.get_data(32);
        q.get_data(23);
        q.get_data(34);
        q.pop_back();
        q.put_data();
    }
}



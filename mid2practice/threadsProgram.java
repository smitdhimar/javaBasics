import java.io.*;
import static java.lang.System.out;
import java.util.Scanner;

//this is the program of matrix's column addtion using threads
class threadsProgram{
  public static void main(String args[]){
    Scanner ob=new Scanner(System.in);
    int n;
    out.print("enter n of matrix: ");
    n=ob.nextInt();
    matrix main_ref=new matrix(n);
    summation arr_th[] =new summation[n];
    for(int i=0;i<n;i++){
      arr_th[i]=new summation(main_ref,i,n);
    }

    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=arr_th[i].getSum();
      arr_th[i].join();
      out.println("addition of column "+i+" : "+ arr[i]);
    }
    
  }
}
class matrix{
  int mat[][];
  int n;
  matrix(int n){
    this.n=n;
    mat=new int[n][n];
    getValues();
  }
  void getValues(){
    Scanner ob=new Scanner(System.in);
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        mat[i][j]=ob.nextInt();
      }
      out.println();
    }
  }
  
}

class summation extends Thread{
  matrix m_ref;
  int my_sum=0;
  int task;
  int size;
  summation(matrix ref,int n,int size){
    super();
    m_ref=ref;
    task=n;
    this.size=size;
    start();
  }
  int getSum(){
    return my_sum;
  }
  public void run(){
    doSum();
    try{
      sleep(2000);
    }
    catch(Exception e){
      out.println(e.toString());
    }
  }
  void doSum(){
    for(int i=0;i<size;i++){
      my_sum+= m_ref.mat[i][task];
    }
  }
}


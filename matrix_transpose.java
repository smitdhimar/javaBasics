import java.io.*;
import java.util.Scanner;
class matrix_transpose{
  public static void main(String arg[]){
  Scanner ob=new Scanner(System.in);
  System.out.println("enter number of rows: ");
  int m=ob.nextInt();
  System.out.println("enter number of columns: ");
  int n=ob.nextInt();
  matrix new_matrix=new matrix(m,n);
  new_matrix.get_value();
  matrix transpose_matrix=new matrix(n,m);
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      transpose_matrix.mat[j][i]=new_matrix.mat[i][j];
     }
  }
  System.out.println();
  transpose_matrix.display();
}
}
class matrix{
 public int m;
 public int n;
 public int mat[][]; 
 matrix(){
 this.m=this.n=0;
}
 void get_value()
 {Scanner ob=new Scanner(System.in);
  
	System.out.println("Enter matrix values: ");
  for(int i=0;i<this.m;i++)
  {
    for(int j=0;j<this.n;j++)
    { 
	this.mat[i][j]=ob.nextInt();
	
    }
     
  }  
 }
 matrix(int a,int b)
{ 
this.m=a;
  this.n=b;
  this.mat=new int[a][b];  
  
}
void display()
{
  for(int i=0;i<m;i++)
	{for(int j=0;j<n;j++){
	System.out.print(mat[i][j]+" ");
	
}
System.out.println();}
}
}
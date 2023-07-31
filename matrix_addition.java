import java.util.Scanner;
import java.io.*;
class matrix_addition{
 public static void main(String arg[])
 { 
   Scanner ob=new Scanner(System.in);
 System.out.println("enter number of rows: ");
  int m=ob.nextInt();
  System.out.println("enter number of columns: ");
  int n=ob.nextInt();
  matrix matrix1=new matrix(m,n);
  matrix matrix2=new matrix(m,n);
  matrix res=new matrix(m,n);
  System.out.println("enter value for matrix 1:");
  matrix1.get_value();
  System.out.println("enter value for matrix 2:");
  matrix2.get_value();
  
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      res.mat[i][j]=matrix1.mat[i][j]+matrix2.mat[i][j];
     }
  }
  System.out.println();
  res.display();
 }
}
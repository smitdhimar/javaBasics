import java.io.*;
import java.util.Scanner;

class matrix {
  public static void main(String arg[]) {
    Scanner ob = new Scanner(System.in);
    System.out.println("for mat1 row, col: ");
    int r1 = ob.nextInt();
    int c1 = ob.nextInt();
    mainmatrix mat1 = new mainmatrix(r1, c1);
    mat1.getValues();
    System.out.println("for mat2 row, col: ");
    int r2 = ob.nextInt();
    int c2 = ob.nextInt();
    mainmatrix mat2 = new mainmatrix(r2, c2);
    mat2.getValues();
    mainmatrix mat3 = mat1.mul(mat2);
    mat3.display();
  }
}

class mainmatrix {
  public int mat[][];
  public int row;
  public int col;

  mainmatrix mul(mainmatrix a) {
    mainmatrix m = new mainmatrix(this.row, a.col);
    for (int i = 0; i < m.row; i++) {
      for (int j = 0; j < m.col; j++) {
        for (int k = 0; k < this.col; k++) {
          m.mat[i][j] += this.mat[i][k] * a.mat[k][j];
        }
      }
    }
    return m;
  }

  mainmatrix(int a, int b) {
    this.mat = new int[a][b];
    this.row = a;
    this.col = b;
  }

  void getValues() {
    Scanner ob = new Scanner(System.in);
    for (int i = 0; i < this.row; i++) {
      for (int j = 0; j < this.col; j++) {
        this.mat[i][j] = ob.nextInt();
      }
    }
  }

  void display() {
    for (int i = 0; i < this.row; i++) {
      for (int j = 0; j < this.col; j++) {
        System.out.print(this.mat[i][j] + " ");
      }
      System.out.println();
    }
  }
}
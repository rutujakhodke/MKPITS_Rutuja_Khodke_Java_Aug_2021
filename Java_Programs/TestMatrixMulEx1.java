//8.Wap of Multiplication of Matrices.create a 2d array of 3 rows and 3 columns and store some value in it and display the values.
public class TestMatrixMulEx1{
 public static void main(String args[]){
  //creating 2 matrices
  int a[][]={{1,2,3},{4,5,6},{7,8,9}};
  int b[][]={{11,12,13},{14,15,16},{14,11,13}};

  //creating another matrix to store the multiplication of 2 matrices
  int c[][]=new int[3][3];//3 rows and 3 columns

  //multiplying and printing multiplication of 2 matrices
  for(int i=0;i<3;i++){

     for(int j=0;j<3;j++){
      c[i][j]=0;
      for(int k=0;k<3;k++){
       c[i][j]+=a[i][k]*b[k][j];
      }//end of k loop
      System.out.print(c[i][j]+" ");
     }//end of j loop
     System.out.println();
  }
 }
}
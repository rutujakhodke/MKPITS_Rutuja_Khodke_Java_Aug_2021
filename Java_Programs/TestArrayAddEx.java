//7.Java program to demonstrate the addition of two matrices using array.
public class TestArrayAddEx{
 public static void main(String args[]){
 //creating two matrices
 int a[][]={{2,3,4},{7,6,5}};//declaration and initialization of array
 int b[][]={{1,3,5},{4,7,6}};
 //creating another matrix to store the sum of two matrices
 int c[][]=new int[2][3];
 //adding and printing the addition of two matrices
  for(int i=0;i<2;i++){

	  for(int j=0;j<3;j++){

		 c[i][j]=a[i][j]+b[i][j];
		 System.out.print(c[i][j]+" ");
	}
	System.out.println();
   }
 }
}
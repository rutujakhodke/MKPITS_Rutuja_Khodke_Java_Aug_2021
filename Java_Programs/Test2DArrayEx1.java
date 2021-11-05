//2.Create a 2D array of 2 rows and 2 columns and store some value in it and display the values.
public class Test2DArrayEx1{
   public static void main(String[] args){
   int a[][]=new int[2][2];
   a[0][0]=10;
   a[0][1]=20;
   a[1][0]=30;
   a[1][1]=40;
   //traverse the matrix elements
   for(int i=0;i<2;i++){

	   for(int j=0;j<2;j++){
	  System.out.print(a[i][j]+" ");
	  }
	 System.out.println();
  }
 }
}
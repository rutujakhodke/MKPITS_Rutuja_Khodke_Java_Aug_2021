//7.Wap of addition of 2 matrices (i.e create an arr1 of 3 rows and 3 cols,create another array arr2 of 3 rows and 3 cols,then create array arr3 to do addition of arr1 and arr2).
public class TestArrayAddEx6{
  public static void main(String args[]){
  //creating 2 matrices
  int a[][]={{1,2,3},{4,5,6},{7,8,9}};
  int b[][]={{2,6,5},{3,2,6},{6,4,3}};
  //creating another matrix to store addition of 2 matrices
  int c[][]=new int[3][3];
  //adding and printing the addition of 2 matrices
  for(int i=0;i<3;i++){

	 for(int j=0;j<3;j++){
		c[i][j]=a[i][j]+b[i][j];
		System.out.print(c[i][j]+" ");
	  }
	  System.out.println();
	}
 }
}
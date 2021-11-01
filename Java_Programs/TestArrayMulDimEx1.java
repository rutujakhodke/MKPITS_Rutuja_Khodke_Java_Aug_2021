//1.Example to instantiate Multidimensional array in java.
import java.util.*;
public class TestArrayMulDimEx1{
 public static void main(String args[]){
   Scanner scan=new Scanner(System.in);
  int[][] arr=new int[3][3];//3 rows and 3 columns
   for(int i=0;i<3;i++){

	   for(int j=0;j<3;j++){
          System.out.println("Enter a Number:");
		  arr[i][j]=scan.nextInt();
	   }
	 }
	//display
	for(int i=0;i<3;i++){

	   for(int j=0;j<3;j++){
		 System.out.print(arr[i][j]+" ");
	  }
	  System.out.println();
	}
 }
}
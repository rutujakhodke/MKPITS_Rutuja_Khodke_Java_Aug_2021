//4.Create a 2D array of 3 rows and 3 columns and accept the values from the user and store in it an array and then display the values.
import java.util.*;
public class Test2DArrayEx3{
 public static void main(String args[]){
   int arr[][]=new int[3][3];//3 rows and 3 columns
   Scanner s=new Scanner(System.in);
   for(int i=0;i<3;i++){

	   for(int j=0;j<3;j++){
		   System.out.println("Enter a Number: ");
		   arr[i][j]=s.nextInt();
		  }
	  }
	 //display
	 System.out.println();
	 for(int i=0;i<3;i++){

		 for(int j=0;j<3;j++){
			 System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	 }
  }
 }


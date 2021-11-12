//6.Create a 2D array of 2 rows and 4 columns and accept the values from the user and store in it an array and then display the values.
import java.util.*;
public class Test2DArrayEx5{
  public static void main(String args[]){
  int arr[][]=new int[2][4];//2 rows and 4 columns
  Scanner scan=new Scanner(System.in);
  for(int i=0;i<2;i++){

	  for(int j=0;j<4;j++){
  System.out.println("Enter a Number: ");
  arr[i][j]=scan.nextInt();
   }
  }
  //display
  System.out.println();
  for(int i=0;i<2;i++){

	  for(int j=0;j<4;j++){
		System.out.print(arr[i][j]+" ");
	  }
	  System.out.println();
	}
 }
}
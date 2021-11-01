//2.Simple example to declare,instantiate,initialize and print the 2Dimensional array.
public class TestArrayMulDimEx2{
 public static void main(String args[]){
 int arr[][]={{1,2,3},{3,5,6},{4,8,9}};//declare and initialize the array

 //display the 2D array
  for(int i=0;i<3;i++){

	   for(int j=0;j<3;j++){
		 System.out.print(arr[i][j]+" ");
	  }
	  System.out.println();
	}
 }
}
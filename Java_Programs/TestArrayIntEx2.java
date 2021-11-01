//2.Wap to create an integer array of 5 elements to store 5 no. and accept the 5 no. from user then display the value stored in an array in Java.
import java.util.*;
public class TestArrayIntEx2{
 public static void main(String[] args){
  Scanner s=new Scanner(System.in);
  int arr[]=new int[5];
  for(int i=0;i<5;i++){
	System.out.println("Enter a number:");
	arr[i]=s.nextInt();
	}
  //displaying the array elements
  System.out.println();
  for(int i=0;i<arr.length;i++){
	  System.out.println(arr[i]);
	}
  }
}
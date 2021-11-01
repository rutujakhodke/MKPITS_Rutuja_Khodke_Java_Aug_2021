//3.Wap to create an integer array of 5 elements to store 5 no. and accept the 5 no. from user then display the value stored in an array in Java.(using for each loop)
import java.util.*;
public class TestArrayIntEx3{
  public static void main(String[] args){
  int num[]=new int[5];
  Scanner scan=new Scanner(System.in);
  for(int i=0;i<5;i++){
	 System.out.println("Enter a Number:");
	 num[i]=scan.nextInt();
  }
  //displaying the array elements
  System.out.println();
  for(int i:num){
	 System.out.println(i);
   }
 }
}

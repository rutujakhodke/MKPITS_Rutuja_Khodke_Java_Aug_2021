//7.Wap to create an long int array of 5 elements to store 5 long integer no. and accept the 5 long integer no. from user then display the long integer no. stored in an array in Java.(using for each loop)
import java.util.*;
public class TestArrayLongIntEx{
  public static void main(String[] args){
  long num[]=new long [5];
  Scanner scan=new Scanner(System.in);
  for(int i=0;i<5;i++){
	System.out.println("Enter a Number:");
	num[i]=scan.nextLong();
	}
	//displaying the array long int elements
	System.out.println();
	for(long i:num){
	System.out.println(i);
  }
 }
}
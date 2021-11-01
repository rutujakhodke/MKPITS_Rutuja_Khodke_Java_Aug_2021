//8.Wap to create int array of 3 elements to store 3 integer no. and accept 3 integer no. from the user and add the 3 elements and then display the sum in java.
import java.util.*;
public class TestArrayIntAddEx{
  public static void main(String[] args){
  int num[]=new int[3];
  int sum=0;
  Scanner scan=new Scanner(System.in);
  for(int i=0;i<3;i++){
	System.out.println("Enter a Number:");
	num[i]=scan.nextInt();
	sum=sum+num[i];
	}
  System.out.println("Sum of 3 numbers is: "+sum);
  }
 }
//6.Wap to create an double array of 5 elements to store 5 long decimal no. and accept the 5 long decimal no. from user then display the long decimal no. stored in an array in Java.(using for each loop)
import java.util.*;
public class TestArrayDoubleEx{
  public static void main(String[] args){
  double num[]=new double[5];
  Scanner scan=new Scanner(System.in);
  for(int i=0;i<5;i++){
	 System.out.println("Enter a Number:");
	 num[i]=scan.nextDouble();
	}
   //displaying the array elements
   System.out.println();
   for(double i:num)
    System.out.println(i);
 }
}
//4.Wap to create an float array of 5 elements to store 5 no. and accept the 5 no. from user then display the value stored in an array in Java.(using for each loop)
import java.util.*;
public class TestArrayFloatEx{
  public static void main(String[] args){
  float num[]=new float[5];
  Scanner scan=new Scanner(System.in);
  for(int i=0;i<5;i++){
	System.out.println("Enter a Number:");
	num[i]=scan.nextFloat();
  }
  //traverse the array elements
  System.out.println();
  for(float i:num){
   System.out.println(i);
  }
 }
}
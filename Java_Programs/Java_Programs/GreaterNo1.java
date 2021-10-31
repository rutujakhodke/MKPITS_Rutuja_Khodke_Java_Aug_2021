//6.wap to accept a 3 no. and display the greater number.
import java.util.*;
class GreaterNo1
{
 public static void main(String args[])
 {
	int num1,num2,num3;
 Scanner s=new Scanner(System.in);
 System.out.println("enter a first number :");
 num1=s.nextInt();
 System.out.println("enter a second number :");
 num2=s.nextInt();
 System.out.println("enter a third number :");
 num3=s.nextInt();

 if(num1>num2 && num1>num3)
 {
	 System.out.println("num1 is greater.");
 }
 else if(num2>num1 && num2>num3)
 {
	 System.out.println("num2 is greater.");
 }
 else
 {
	 System.out.println("num3 is greater.");
 }
}
}
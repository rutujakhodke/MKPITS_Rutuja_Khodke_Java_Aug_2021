//1.wap to accept a 2 no. and display the greater number.
import java.util.*;
class GreaterNo
{
 public static void main(String args[])
 {
	 int num1,num2;
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter a first number :");
	 num1=s.nextInt();
	 System.out.println("enter a second number :");
	 num2=s.nextInt();
	 if(num1>num2)
	 {
		 System.out.println("num1 is greater.");
	 }
	 else{
		 System.out.println("num2 is greater.");
		 }
  }
}
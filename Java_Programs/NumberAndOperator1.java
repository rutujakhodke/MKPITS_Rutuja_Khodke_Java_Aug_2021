//2.wap to accept a 2 number and operator like +,-,* and then display the result using switch.
import java.util.*;
class NumberAndOperator1
{
 public static void main(String args[])
 {
	 int num1,num2,result=0;
	 char op;
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter a number1 :");
	 num1=s.nextInt();
	 System.out.println("enter a number2 :");
	 num2=s.nextInt();
	 System.out.println("enter a operator +,-,* :");
	 op=s.next().charAt(0);

	 switch(op)
	 {
		 case '+':
		      result=num1+num2;
		      break;
		 case '-':
		      result=num1-num2;
		      break;
		 case '*':
		      result=num1*num2;
		      break;
		 default:
		      System.out.println("invalid operator");
		      break;
	 }
	 System.out.println("result is :"+result);
	}
}
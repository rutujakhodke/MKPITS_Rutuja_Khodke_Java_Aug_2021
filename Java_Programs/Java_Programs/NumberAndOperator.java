//5.wap to accept 2 number and operator like +,-,*,/ and display result.
import java.util.*;
class NumberAndOperator
{
public static void main(String args[])
{
  int num1,num2;
  int result=0;
  char op;
  Scanner s=new Scanner(System.in);
  System.out.println("enter a first number :");
  num1=s.nextInt();
  System.out.println("enter a second number :");
  num2=s.nextInt();
  System.out.println("enter a operator like +,-,*,/ :");
  op=s.next().charAt(0);

  if(op=='+')
  {
	  result=num1+num2;
  }
  else if(op=='-')
  {
	  result=num1-num2;
  }
  else if(op=='*')
  {
	  result=num1*num2;
  }
  else if(op=='/')
  {
	  result=num1/num2;
  }
  else
  {
	  System.out.println("invalid operator.");
  }
  System.out.println("result is ="+result);
 }
}
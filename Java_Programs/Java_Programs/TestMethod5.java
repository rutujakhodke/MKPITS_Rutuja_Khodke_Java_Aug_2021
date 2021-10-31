//7.(Function with parameters and returning nothing(void)).wap to create a function calculate with 3 parameters (2 int and one char)to accept 2 no. and one operator.calculate and display the result.
import java.util.*;
class Operator{
 int n1,n2;
 char op;
 int result;
 public void calculate(int n1,int n2,char op){
	 int result=0;
  switch(op){
    case'+':
          result=n1+n2;
          break;
    case'-':
           result=n1-n2;
           break;
    case'*':
          result=n1*n2;
           break;
    default:
           System.out.println("Invalid operator.");
           break;
    }
  System.out.println("Result is ="+result);
 }
}
class TestMethod5{
public static void main(String args[]){
int n1,n2;
char op;
Scanner s=new Scanner(System.in);
System.out.println("Enter a Number :");
n1=s.nextInt();
System.out.println("Enter a Second number :");
n2=s.nextInt();
System.out.println("Enter a operator like +,-,* :");
op=s.next().charAt(0);
Operator o1=new Operator();
o1.calculate(n1,n2,op);
System.out.println("Bye from main function.");
}
}
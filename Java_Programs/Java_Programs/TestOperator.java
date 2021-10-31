//11.(function with return value and with parameters).wap to create a method calculate with 3 parameters(2 int and one char)to accept 2 no.and operator.
import java.util.*;
class Operator{

 public int calculate(int n1,int n2,char op){
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
   return result;
 }
}
class TestOperator{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter a number :");
int n1=s.nextInt();
System.out.println("Enter a Second number :");
int n2=s.nextInt();
System.out.println("Enter a Operator like +,-,* :");
char op=s.next().charAt(0);

Operator o1=new Operator();

int result=o1.calculate(n1,n2,op);
System.out.println("Result is ="+result);
 }
}
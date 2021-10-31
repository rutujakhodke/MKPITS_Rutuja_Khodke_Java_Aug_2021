//8.(Function with parameters and returning nothing(void)).wap to create function factorial with one int parameter ,calculate and display the factorial of that number.
import java.util.*;
class FactorialMethod{
 int num;
 int fact=1;
 public void factorial(int num){
  int i;
  for(i=1;i<=num;i++){
   fact=fact*i;
  }
  System.out.println("Factorial of a " +num+ "is ="+fact);
 }

 public static void main(String args[]){
 int num1;
 Scanner s=new Scanner(System.in);
 System.out.println("Enter a Number :");
 num1=s.nextInt();
 FactorialMethod f1=new FactorialMethod();
 f1.factorial(num1);
}
}
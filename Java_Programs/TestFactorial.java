//11.(function with return value and with parameters).wap to create a method factorial with one int parameter,calculate factorial and return the factorial.
class Factorial{

public int factorial(int num){
 int fact=1;
  while(num>0){
    fact=fact*num;
    num--;
  }
  return fact;
 }
}
class TestFactorial{
public static void main(String args[]){
java.util.Scanner s=new java.util.Scanner(System.in);
System.out.println("Enter a Number :");
int num=s.nextInt();
Factorial f=new Factorial();
int factorial=f.factorial(num);
System.out.println("Factorial of "+num+ " is ="+factorial);
 }
}
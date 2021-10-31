//6.(Function with parameters and returning nothing(void)).wap to create a function sum with 2 int parameters and write code in it to add and display the addition of 2 no.
import java.util.*;
class Addition{
int num1,num2;
int result;
public static void sum(int num1,int num2){
 int result=num1+num2;
 System.out.println("Addition of a 2 number is ="+result);
 }
}
class TestMethod4{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter a number :");
int n1=s.nextInt();
System.out.println("Enter a second number :");
int n2=s.nextInt();
Addition a1 = new Addition();
a1.sum(n1,n2);
 }
}
//3.(function with no parameter and returning nothing (void)).wap to create a function square to accept a no. and display the square of that no.
import java.util.*;
class TestMethod1{
 int num1,square;
 public static void square(){
  Scanner s=new Scanner(System.in);
  System.out.println("Enter a Number :");
  int num1=s.nextInt();
  int square=num1*num1;
  System.out.println("Square of a number is ="+square);
 }


public static void main(String args[]){
TestMethod1 f1=new TestMethod1();
//f1.square();//calling method square() from reference created by object.
square();//when method is static we have to call method square() directly.
TestMethod1 f2=new TestMethod1();
f2.square();
System.out.println("Bye from main function.");
 }
}
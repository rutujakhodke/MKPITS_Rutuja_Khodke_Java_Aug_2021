//5.(Function with parameters and returning nothing(void)).wap to create a function square with one int parameter to accept a no. and calculate and display the square of that no.
import java.util.*;
class TestMethod3{
int num;
int square;
public void square(int num){
 square=num*num;
 System.out.println("Square of a "+num+ " is ="+square);
 }
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter a number :");
 int num=s.nextInt();
TestMethod3 m1=new TestMethod3();
m1.square(num);
System.out.println("Bye from main method.");
 }
}
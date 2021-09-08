//7.wap to acept a 2 number and then print addition of 2 number.
import java.util.*;
class Addition
{
public static void main(String args[])
{
 int num1,num2;
Scanner s=new Scanner(System.in);
System.out.println("enter a first number :");
num1=s.nextInt();
System.out.println("enter a second number :");
num2=s.nextInt();
int sum=num1+num2;
System.out.println("addition of 2 number is :"+sum);
}

}
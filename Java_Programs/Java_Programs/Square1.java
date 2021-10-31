//5.wap to accept a number from the user and then print square of that number.
import java.util.*;//java is package ,util is subpackage.
class Square1
{
public static void main(String args[])
{
int num;
//scanner is a class having method to accept a value.
//creating object of scanner class.
Scanner s=new Scanner(System.in);//s is object of scanner class.
System.out.println("enter a number");
num=s.nextInt();//nextInt()is a method in scanner class to accept integer value.
int square=num*num;
System.out.println("square :"+square);
}
}
//6.wap to accept a no. and print square of that number using do while loop.
import java.util.*;
class SquareNo
{
 public static void main(String args[])
 {
	 int num,square;
	 char ans;
	 do
	 {
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter a number :");
		 num=s.nextInt();
		 square=num*num;
		 System.out.println(" square of a number is ="+square);
		 System.out.println("do you want to continue if yes press y otherwise n :");
		 ans=s.next().charAt(0);
	 }while(ans=='y');
	 System.out.println("bye");
 }
}
//7.wap to print table of a no.using do while loop.
import java.util.*;
class DoWhileTable
{
 public static void main(String args[])
 {
	 int num,result;
	 int i;
	 char ans;
	 do
	 {
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter a number :");
		 num=s.nextInt();
		 i=1;
		 System.out.println("table of a "+ num +" is :");
		 while(i<=10){
		 result=num*i;
		 System.out.println(num+ " * " +i+ " = "+result);
		 i=i+1;
		 }
		 System.out.println("do you want to continue if yes press y otherwise n :" );
		 ans=s.next().charAt(0);
	 }while(ans=='y');
	 System.out.println("bye");

 }
}
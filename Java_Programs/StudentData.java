//9.wap to accept a roll no,name and address and then display it.
import java.util.*;
class StudentData
{
	public static void main(String args[])
	{
		int rno;
		String name;
		String address;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a roll number :");
		rno=s.nextInt();
		System.out.println("Enter a name :");
		name=s.next();
		System.out.println("enter a address :");
		address=s.next();

		System.out.println("rno :"+ rno);
		System.out.println("name :"+name);
		System.out.println("address :"+address);
	}
 }
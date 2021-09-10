//10.wap to accept 3 subject marks and then print total marks.
import java.util.*;
class Subject
{
	public static void main(String []abc)
	{
		int m1,m2,m3;
		float total;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a first subject marks :");
		m1=s.nextInt();
		System.out.println("enter a second subject marks :");
		m2=s.nextInt();
		System.out.println("Enter a third subject marks :");
		m3=s.nextInt();
		total=m1+m2+m3;
		System.out.println("Total of a 3 subject marks :"+total);
	}
}
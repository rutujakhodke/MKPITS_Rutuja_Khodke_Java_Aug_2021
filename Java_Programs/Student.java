//3.wap to accept 3 subject marks and calculate total,percentage and grade.
import java.util.*;
class Student
{
	public static void main(String args[])
	{
		int m1,m2,m3;
		int total;
		float per;
		char grade;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a marks 1 :");
		m1=s.nextInt();
		System.out.println("enter a marks 2 :");
		m2=s.nextInt();
		System.out.println("enter a marks 3 :");
		m3=s.nextInt();
		total=m1+m2+m3;
		per=(float)total/300.0f*100.0f;

		if(per>=90)
		{
			grade='A';
		}
		else if(per>=80)
		{
			grade='B';
		}
		else if(per>=70)
		{
			grade='C';
		}
		else if(per>=60)
		{
			grade='D';
		}
		else
		{
			grade='E';
		}
		System.out.println("Total of marks ="+total);
		System.out.println("percentage ="+per);
		System.out.println("grade ="+grade);

	}
}
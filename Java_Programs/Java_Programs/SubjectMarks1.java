//10.wap to accept 5 subject marks using  while loop and print the sum of subjects and percentage and also grade.
import java.util.*;
class SubjectMarks1
{
 public static void main(String args[])
 {
	 int marks,sum=0,i=1;
	 float per;
	 while(i<=5)
	 {
	  Scanner s=new Scanner(System.in);
	  System.out.println("enter a subject marks :");
	  marks=s.nextInt();
	  sum=sum+marks;
	  i++;
	 }
	 System.out.println("sum of 5 subject marks :"+sum);
	 per=(float)sum/500.0f*100.0f;
	 System.out.println("percentage of a student :"+per);
	 if(per>=75)
	 {
		System.out.println("grade=distinction");
	 }
	 else if(per>=60)
	 {
		 System.out.println("grade=first");
	 }
	 else if(per>=50)
	 {
		System.out.println("grade=second");
	 }
	 else
	 {
		 System.out.println("grade=fail");
	 }
 }
}
//7.wap to accept 3 subject marks then calculate total,percentage and grade.
import java.util.*;
class StudentMarks
{
 public static void main(String args[])
 {
	 int m1,m2,m3,total;
	 float percentage;
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter a marks1 :");
	 m1=s.nextInt();
	 System.out.println("enter a marks2 :");
	 m2=s.nextInt();
	 System.out.println("enter a marks3 :");
	 m3=s.nextInt();
	 total=m1+m2+m3;
	 percentage=(float)total/300.0f*100.0f;
     System.out.println("total marks of subject ="+total);
	 System.out.println("percentage ="+percentage);
	 if(percentage>=75)
	 {
		 System.out.println("grade=distinction.");
	 }
	 else if(percentage>=60 && percentage<75)
	 {
		 System.out.println("grade=first.");
	 }
	 else if(percentage>=45 && percentage<60)
	 {
		 System.out.println("grade=second.");
	 }
	 else
	 {
		 System.out.println("grade=fail.");
	 }
  }
}
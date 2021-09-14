//9.wap to accept 5 subject marks using do while loop and print the sum of subjects and percentage.
import java.util.*;
class SubjectMarks
{
 public static void main(String args[])
 {
	 int marks,sum=0,i=1;
	 float per;
	 do
	 {
	  Scanner s=new Scanner(System.in);
	  System.out.println("enter a subject marks :");
	  marks=s.nextInt();
	  sum=sum+marks;
	  i++;
	 }while(i<=5);
	 System.out.println("sum of 5 subject marks :"+sum);
	 per=(float)sum/500.0f*100.0f;
	 System.out.println("percentage of student :"+per);
  }
}
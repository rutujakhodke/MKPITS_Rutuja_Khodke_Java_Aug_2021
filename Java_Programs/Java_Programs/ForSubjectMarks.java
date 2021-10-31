//9.wap to accept 5 subject marks using for loop and print total and percentage.calculate and display grades using if else statement.
import java.util.*;
class ForSubjectMarks
{
 public static void main(String args[])
 {
   int marks,i,total=0;
   float per;

   for(i=1;i<=5;i++)
   {
	  Scanner s=new Scanner(System.in);
	  System.out.println("enter a subject marks :");
      marks=s.nextInt();
      total=total+marks;
   }
   System.out.println("total of 5 subject marks :"+total);
   per=(float)total/500.0f*100.0f;
   System.out.println("percentage of a student :"+per);
   if(per>=75)
   {
	   System.out.println("grade=distinction.");
   }
   else if(per>=60 && per<75)
   {
	   System.out.println("grade=first.");
   }
   else if(per>=45 && per<60)
   {
	   System.out.println("grade=second.");
   }
   else
   {
	   System.out.println("grade=fail.");
   }
}
}

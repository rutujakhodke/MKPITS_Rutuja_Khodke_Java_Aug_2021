//1.wap to accept 3 subject marks and then print total,percentage.
import java.util.*;
class StudentData1
{
  public static void main(String args[])
  {
	  int m1,m2,m3;
	  float total,percentage;
	  Scanner s=new Scanner(System.in);
	  System.out.println("enter a first subject marks :");
	  m1=s.nextInt();
	  System.out.println("enter a second subject marks :");
	  m2=s.nextInt();
	  System.out.println("enter a third subject marks :");
	  m3=s.nextInt();
	  total=m1+m2+m3;
	  System.out.println("total of 3 subject marks :"+total);
	  percentage=(float)(total/300.0f)*100.0f;
	  System.out.println("percentage ="+percentage);
   }
}
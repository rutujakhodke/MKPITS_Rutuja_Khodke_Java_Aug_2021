//10.wap to accept age of 5 students using for loop and then display the average age.
import java.util.*;
class ForStudentsAge
{
 public static void main(String args[])
 {
  int age,i,total=0;
  float average;

  for(i=1;i<=5;i++)
  {
   Scanner s=new Scanner(System.in);
   System.out.println("enter a student age :");
   age=s.nextInt();
   total=total+age;
  }
  average=(float)total/5.0f;
  System.out.println("average age of student is ="+average);
 }
}
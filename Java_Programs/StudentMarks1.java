//9.(Function with parameters and returning nothing(void)).wap to create a function result with 3 int parameters to accept 3 subject marks .calculate and display total,percentage,grade.
 import java.util.*;
 class StudentMarks1{
 int m1,m2,m3;
 int total;
 float per;
 String grade;
 public void result(int m1,int m2,int m3){
  int total=m1+m2+m3;
  System.out.println("Total marks of a Student is ="+total);
  per=(total/300.0f)*100.0f;
  System.out.println("Percentage of a student is ="+per);
    if(per>=75){
    grade="Distinction";
   }
   else if(per>=60 && per<75){
    grade="First";
   }
   else{
   grade="Fail";
  }
  System.out.println("Grade of a Student is ="+grade);
 }
 public static void main(String args[]){
 Scanner s=new Scanner(System.in);
 StudentMarks1 s1=new StudentMarks1();
 System.out.println("Enter a marks :");
 int m1=s.nextInt();
 System.out.println("Enter a second marks :");
 int m2=s.nextInt();
 System.out.println("Enter a third marks :");
 int m3=s.nextInt();
 s1.result(m1,m2,m3);

}
}
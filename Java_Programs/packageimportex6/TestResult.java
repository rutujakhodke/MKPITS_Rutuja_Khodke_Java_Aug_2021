//create a class TestResult to use the class Result created in mkpits1 package.
import mkpits1.Result;
import java.util.*;
class TestResult{
 public static void main(String args[]){
 Result r1=new Result();
 Scanner s=new Scanner(System.in);
 System.out.println("Enter a Phy marks :");
 int phy=s.nextInt();
 System.out.println("Enter a Chem marks :");
 int chem=s.nextInt();
 System.out.println("Enter a Bio marks :");
 int bio=s.nextInt();
 int total=r1.calculateTotal(phy,chem,bio);
 System.out.println("Total marks of Student are :"+total);
 float percentage=r1.calculatePercentage();
 System.out.println("Percentage of student is :"+percentage);
 String grade=r1.calculateGrade();
 System.out.println("Grade of student is :"+grade);
 }
}
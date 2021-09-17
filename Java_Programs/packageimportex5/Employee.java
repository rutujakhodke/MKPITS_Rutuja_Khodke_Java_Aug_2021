//2.create a package mkpits1 and a class Employee having fields empno,empname,basicsalary.create method insert,calculateBonus,display.
package mkpits1;
 public class Employee{
 int empNo;
 String empName;
 int basicSalary;
 float bonus;
 public void insert(int e,String en,int b){
  empNo=e;
  empName=en;
  basicSalary=b;
 }
public void calculateBonus(){
 bonus=basicSalary*0.65f;
 }
  public void display(){
  System.out.println(empNo+" "+empName+" "+basicSalary+" "+bonus);
 }

}
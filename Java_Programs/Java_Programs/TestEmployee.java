//9.create a class employee having empno,empname,desgnation and salary.
class Employee
{
 int empNo;
 String empName;
 String empDesignation;
 float empSalary;

 public void insertEmpDetails(int eno,String ename,String edes,Float esal)
 {
  empNo=eno;
  empName=ename;
  empDesignation=edes;
  empSalary=esal;
 }
 public void displayEmpDetails()
 {
  System.out.println("Employee no is ="+empNo);
  System.out.println("Employee name is:"+empName);
  System.out.println("Employee designation is :"+empDesignation);
  System.out.println("Employee salary is ="+empSalary);
 }
}
 class TestEmployee
 {
  public static void main(String args[])
  {
   Employee e1 =new Employee();
   e1.insertEmpDetails(101,"Amit","Manager",30000.0f);
   e1.displayEmpDetails();
  }
 }

//9.Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
//Name        Year of joining        Address
//Robert            1994                64C- WallsStreat
//Sam                2000                68D- WallsStreat
//John                1999                26B- WallsStreat
class Employee{
String name;
int year_join;
float salary;
String address;

public void insertEmpData(String name,int year_join,float salary,String address){
 this.name=name;
 this.year_join=year_join;
 this.salary=salary;
 this.address=address;
 }
 public void displayEmpData(){
 System.out.println(name+"  "+year_join+"  "+salary+"  "+address);
 }
}
class TestEmployeeData{
public static void main(String args[]){
Employee emp1=new Employee();
emp1.insertEmpData("Robert",1994,10000,"64C-WallsStreat");
emp1.displayEmpData();

Employee emp2=new Employee();
emp2.insertEmpData("Sam",2000,20000,"68D-WallsStreat");
emp2.displayEmpData();

Employee emp3=new Employee();
emp3.insertEmpData("John",1999,30000,"26B-WallsStreat");
emp3.displayEmpData();
 }
}
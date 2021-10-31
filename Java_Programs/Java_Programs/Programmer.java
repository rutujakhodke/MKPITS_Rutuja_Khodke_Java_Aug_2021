//2.Create a parent class Employee having fields salary and then create a inherited class Programmer having new fields bonus.
//creating super class Employee
class Employee{
 float salary=20000;//assigning values to instance variable

}
//creating subclass Programmer
class Programmer extends Employee{
 int bonus=5000;

 public static void main(String args[]){
 Programmer p1=new Programmer();
 System.out.println(p1.salary+" "+p1.bonus);
 System.out.println("Salary is ="+p1.salary);
 System.out.println("Bonus is ="+p1.bonus);
 }
}
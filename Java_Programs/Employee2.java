//2.example of Aggregation.Employee has an object of Address ,address object contains its own info.such as city,state,country etc.
class Address{
 String city;
 String state;
 String country;

 public Address(String city,String state,String country){
  this.city=city;
  this.state=state;
  this.country=country;
 }
}
class Employee2{
 int empno;
 String empname;
 Address address;//aggregation

 public Employee2(int empno,String empname,Address address){
  this.empno=empno;
  this.empname=empname;
  this.address=address;
 }
void display(){
System.out.println(empno+" "+empname);
System.out.println(address.city+" "+address.state+" "+address.country);
 }

public static void main(String args[]){
Address address1=new Address("Nagpur","Maharashtra","India");
Address address2=new Address("Kolkata","Bengal","India");

Employee2 e1=new Employee2(112,"Amit Kumar",address1);
Employee2 e2=new Employee2(113,"Manit Thakur",address2);
e1.display();
e2.display();
 }
}
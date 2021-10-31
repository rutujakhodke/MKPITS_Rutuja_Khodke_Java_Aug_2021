//3.example of Aggregation.create a class Address and Employee of some fields.then access the constructor variables of Address class by creating its reference in Employee class.(accepting value from user).
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
class Employee{
 int empId;
 String name;
 Address address;//aggregation reference of Address class

 public Employee(int empId,String name,Address address){
   this.empId=empId;
   this.name=name;
   this.address=address;
 }
void display(){
 System.out.println(empId+" "+name);
 System.out.println(address.city+" "+address.state+" "+address.country);
 }
}
class TestAggregation{
 public static void main(String args[]){
 java.util.Scanner s=new java.util.Scanner(System.in);
 System.out.println("Enter a Employee Id :");
 int empId=s.nextInt();
 System.out.println("Enter a Employee Name :");
 String name=s.next();
 System.out.println("Enter a City Name :");
 String city=s.next();
 System.out.println("Enter a State Name :");
 String state=s.next();
 System.out.println("Enter a Country Name :");
 String country=s.next();

 Address address1=new Address(city,state,country);

 Employee e1=new Employee(empId,name,address1);
 e1.display();

 System.out.println("Enter a Employee Id :");
   empId=s.nextInt();
  System.out.println("Enter a Employee Name :");
   name=s.next();
  System.out.println("Enter a City Name :");
   city=s.next();
  System.out.println("Enter a State Name :");
   state=s.next();
  System.out.println("Enter a Country Name :");
  country=s.next();

 Address address2=new Address(city,state,country);

 Employee e2=new Employee(empId,name,address2);
 e2.display();
 }
}

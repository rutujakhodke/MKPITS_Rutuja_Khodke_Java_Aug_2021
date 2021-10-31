//5.create a Parent class Person ,then create a child class Customer inherits from Person class by using super keyword(invoke parent class method).
class Person{
 String name;
 String address;

 void getData(String name,String address){
  this.name=name;
  this.address=address;
 }
 void displayData(){
  System.out.println("Name ="+name+ " address ="+address);
 }
}
class Customer extends Person{
 int custId;
 long custMobNo;

 void getData(int custId,long custMobNo,String name,String address){
  getData(name,address);
   this.custId=custId;
   this.custMobNo=custMobNo;
 }
 void displayData(){
  super.displayData();
  System.out.println("custId ="+custId+ " custMobNo ="+custMobNo);
 }
}
class TestSuper7{
public static void main(String args[]){
Customer c1=new Customer();
java.util.Scanner s=new java.util.Scanner(System.in);
System.out.println("Enter a Customer Details :");
int custId=s.nextInt();
long custMobNo=s.nextLong();
String name=s.next();
String address=s.next();
c1.getData(custId,custMobNo,name,address);
c1.displayData();
 }
}

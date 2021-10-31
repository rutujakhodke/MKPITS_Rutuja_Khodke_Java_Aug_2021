//6.create a person class and then create a child class Customer having fields customer no.,gstno.
class Person{
 String name;
 String address;
 
 void insertPersonData(String name,String address){
  this.name=name;
  this.address=address;
 }
 void displayPersonData(){
 System.out.println(name+"  "+address);
 }
}
class Customer extends Person{
 int custNo;
 long gstNo;
 
 void insertCustomerData(int custNo,long gstNo){
  this.custNo=custNo;
  this.gstNo=gstNo;
 }
 void displayCustomerData(){
  System.out.println(custNo+" "+gstNo);
 }
}
class TestInheritance4{
 public static void main(String args[]){
 Customer c1=new Customer();
 c1.insertPersonData("Manit Sahu","Pune");
 c1.insertCustomerData(176,5609832);
 c1.displayPersonData();
 c1.displayCustomerData();
 }
}
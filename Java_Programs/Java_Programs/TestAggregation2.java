//5.example of Aggregation.Customer has an object of Address ,address object contains its own info.such as city,state,country etc.(Customer has an address)
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
class Customer{
 int custId;
 String name;
 Address address;//aggregation

 public Customer(int custId,String name,Address address){
   this.custId=custId;
   this.name=name;
   this.address=address;
  }
 void display(){
 System.out.println(custId+" "+name);
 System.out.println(address.city+" "+address.state+" "+address.country);
 }
}
class TestAggregation2{
public static void main(String args[]){
Address address1=new Address("Mumbai","Maharashtra","India");
Address address2=new Address("Hyderabad","Telangana","India");

Customer c1=new Customer(160,"Ajit Kumar",address1);
Customer c2=new Customer(162,"Rajesh Sahu",address2);
c1.display();
//address1.display();//error
c2.display();
 }
}

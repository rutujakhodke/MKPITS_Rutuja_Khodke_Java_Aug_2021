//7.Example of Java Serialization with Aggregation (HAS-A Relationship).
import java.io.*;
class Address implements Serializable{
 String addressLine;
 String city;
 String state;
 public Address(String addressLine,String city,String state){
  this.addressLine=addressLine;
  this.city=city;
  this.state=state;
 }
}
class Customer implements Serializable{
 String name;
 String email;
 Address address;
 public Customer(String name,String email,Address address){
  this.name=name;
  this.email=email;
  this.address=address;
 }
}
public class SerializeAggregation1{
 public static void main(String[] args){
	 try{
 Address addr=new Address("Shivaji Nagar","Pune","Maharashtra");
 Customer c1=new Customer("Ruhi Bedi","ruhi@gmail.com",addr);
 FileOutputStream fos=new FileOutputStream("f:\\ioex\\myfile5.txt");
 ObjectOutputStream oos=new ObjectOutputStream(fos);
 oos.writeObject(c1);
 oos.flush();
 oos.close();
 fos.close();
 System.out.println("Customer class Object is serialized successfully..");
 }catch(Exception e){
	 System.out.println(e.toString());
 }
 try{
	 FileInputStream fis=new FileInputStream("f:\\ioex\\myfile5.txt");
	 ObjectInputStream ois=new ObjectInputStream(fis);
	 Customer c1=(Customer)ois.readObject();
	 System.out.println(c1.name+" "+c1.email+" "+c1.address.addressLine+" "+c1.address.city+" "+c1.address.state);
	 System.out.println("Deserialization process of class Customer is successful..");
	 ois.close();
 }catch(Exception e){
	 System.out.println(e.toString());
  }
 }
}
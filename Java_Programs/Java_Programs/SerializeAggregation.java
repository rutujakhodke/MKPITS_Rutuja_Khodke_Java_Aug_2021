//6.Example of Java Serialization with Aggregation (HAS-A Relationship).
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
class Student implements Serializable{
 int id;
 String name;
 Address address;//reference of Address class
 public Student(int id,String name,Address address){
  this.id=id;
  this.name=name;
  this.address=address;
 }
}
public class SerializeAggregation{
 public static void main(String args[]){
  try{
 Address addr=new Address("Ram Nagar","Nagpur","Maharashtra");
 Student s=new Student(110,"Ginni Kumar",addr);
 FileOutputStream fos=new FileOutputStream("f:\\ioex\\myfile4.txt");
 ObjectOutputStream oos=new ObjectOutputStream(fos);
 oos.writeObject(s);
 oos.flush();
 oos.close();
 fos.close();
 System.out.println("Serialization of class Student Object Successful..");
 }catch(Exception e){
  System.out.println(e.toString());
 }
 try{
   ObjectInputStream ois=new ObjectInputStream(new FileInputStream("f:\\ioex\\myfile4.txt"));
   Student s=(Student)ois.readObject();
   System.out.println(s.id+" "+s.name+" "+s.address.addressLine+" "+s.address.city+" "+s.address.state);
   System.out.println("Deserialization Successful..");
   ois.close();
 }catch(Exception e){
  System.out.println(e.toString());
  }
 }
}
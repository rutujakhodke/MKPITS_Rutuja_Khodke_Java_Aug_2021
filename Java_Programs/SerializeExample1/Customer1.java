//1.Example of java Serialization.create a class Customer for serializing its object.
import java.io.Serializable;
public class Customer1 implements Serializable{
 String name;
 String email;
 public Customer1(String name,String email){
  this.name=name;
  this.email=email;
 }
}
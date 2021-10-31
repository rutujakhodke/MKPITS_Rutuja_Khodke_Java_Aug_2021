//5.Example of Serialization with Inheritance(IS-A realtionship).create a class Person and create a child class Employee.
import java.io.*;
 class Person implements Serializable{
  int id;
  String name;
  public Person(int id,String name){
   this.id=id;
   this.name=name;
  }
 }
 class Employee extends Person{
  String designation;
  float salary;
  public Employee(int id,String name,String designation,float salary){
   super(id,name);
   this.designation=designation;
   this.salary=salary;
  }
 }
 public class SerializeInheritance1{
  public static void main(String[] args){
  try{
    Employee emp=new Employee(102,"Riya Kumar","Manager",30000);
    FileOutputStream fos=new FileOutputStream("f:\\ioex\\myfile3.txt");
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(emp);
    oos.flush();
    oos.close();
    fos.close();
    System.out.println("Object of Employee class is serialized successfully..");
  }catch(Exception e){
   System.out.println(e);
  }
  try{
     FileInputStream fis=new FileInputStream("f:\\ioex\\myfile3.txt");
     ObjectInputStream ois=new ObjectInputStream(fis);
     Employee emp=(Employee)ois.readObject();
     System.out.println(emp.id+" "+emp.name+" "+emp.designation+" "+emp.salary);
     System.out.println("Deserialization successful..");
     ois.close();
  }catch(Exception e){
   System.out.println(e);
   }
  }
 }

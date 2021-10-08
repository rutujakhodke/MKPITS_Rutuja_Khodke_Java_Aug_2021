//3.Example of java Serialization.create a class Employee and create its object which can be serialized int byte stream.create a class Persist2
//for serialization of object.create another class DePersist2 for deserialization of reconstructing object from byte stream.
import java.io.Serializable;
public class Employee3 implements Serializable{
 int empId;
 String empName;
 float salary;
 public void insertData(int empId,String empName,float salary){
   this.empId=empId;
   this.empName=empName;
   this.salary=salary;
 }
 public void display(){
 System.out.println(empId+" "+empName+" "+salary);
 }
}
//creating a class Persist2 for serialization.
import java.io.*;
public class Persist2{
 public static void main(String args[]){
 try{
    Employee3 e1=new Employee3();
    java.util.Scanner s=new java.util.Scanner(System.in);
    System.out.println("Enter a Employee Id :");
    int empId=s.nextInt();
    System.out.println("Enter a Employee Name :");
    String empName=s.next();
    System.out.println("Enter a Employee Salary :");
    float salary=s.nextFloat();
    e1.insertData(empId,empName,salary);
    FileOutputStream fos=new FileOutputStream("f:\\ioex\\myfile1.txt");
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(e1);
    oos.flush();
    oos.close();
    fos.close();
    System.out.println("Object of Employee class is serialized successfully..");
    }catch(Exception e){
     System.out.println(e.toString());
    }
   }
  }
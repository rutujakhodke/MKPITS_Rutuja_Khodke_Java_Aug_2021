//11.Example of Java Exception Handling.In this example we use try-catch block to resolve error.
public class TryCatchEx1{
 public static void main(String args[]){
    try{
       int data=20/0;//may throw exception
   }
   catch(ArithmeticException ee){//handling the Exception
     System.out.println(ee);
   }
   System.out.println("Rest of the code will be executed..");
 }
}
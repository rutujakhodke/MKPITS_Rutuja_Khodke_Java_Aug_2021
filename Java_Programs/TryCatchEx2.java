//12.Example of Java Exception Handling.In this eg we also kept the code in a try block that will not throw an exception.
public class TryCatchEx2{
 public static void main(String args[]){
   try{
      int data=30/0;
     //if exception occurs ,then the remaining code will not be execute
     System.out.println("Rest of the code will execute");
   }
   catch(ArithmeticException ee){//we handle the exception using child class exception.Its parent class is Exception.
     System.out.println(ee);
   }
  System.out.println("Bye from Exception Block");
 }
}
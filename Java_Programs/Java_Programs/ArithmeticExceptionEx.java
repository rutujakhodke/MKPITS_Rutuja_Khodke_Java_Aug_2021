//5.Java Exception Handling Example,where we are using a try-catch statement to handle the exception.(Arithmatic Exception)
public class ArithmeticExceptionEx{
 public static void main(String args[]){
  try{
  //raise the statement that will occur exception
    int data=100/0;//it will occur Arithmetic exception.
  }catch(ArithmeticException e){
   System.out.println(e);
  }
  System.out.println("Rest of the code will be Executed..");
 }
}

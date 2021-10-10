//6.Java Exception Handling Example.consider a example where an ArithmeticException occurs.
public class ArithmeticExceptionEx1{
 public static void main(String[] args){
  try{
     int a=100/0;//Arithmetic exception occurs
  }catch(Exception ee){
    System.out.println(ee.toString());
  }
  System.out.println("Rest of the code will be Executed..");
 }
}
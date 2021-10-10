//5.Example of Java Exception Handling.In this example we use java try block with Multiple-catch block.we generate NullPointerException ,but didn't provide the corresponding exception type.In such case,the catch block containing
//the parent exception class Exception will invoked.
public class MultipleCatchBlockEx5{
 public static void main(String args[]){
	 try{
		 String s=null;
		System.out.println(s.length());
 }catch(ArithmeticException e){
	 System.out.println("Arithmetic Exception occurs..");
 }
  catch(ArrayIndexOutOfBoundsException e){
	  System.out.println("ArrayIndexOutOfBounds Exception occurs..");
 }
  catch(Exception e){
 	  System.out.println("Parent exception occurs..");
 }
 System.out.println("Rest of the code is executed..");
 }
}

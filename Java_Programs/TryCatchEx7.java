//17.Example of Java Exception Handling.We handle the generated exception (ArithmeticException) with a different type of exception class (ArrayIndexOutOfBoundsException).
public class TryCatchEx7{
 public static void main(String args[]){
	 try{
		 int data=20/0;//it will occur ArithmeticException
	//try to handle the Arithmetic Exception using ArrayOutOfBoundsException
   }catch(ArrayIndexOutOfBoundsException e){
	   System.out.println(e);
   }
   System.out.println("Bye from Try-Catch block of exception");
 }
}
//14.Example of Java Exception Handling.To print a custom message on Exception.
public class TryCatchEx4{
 public static void main(String args[]){
	 try{
		 int data=40/0;
	}catch(Exception e){
		System.out.println("can't be divided by zero");//it will print custom message
	}
	System.out.println("Bye from Try-Catch block..");
 }
}
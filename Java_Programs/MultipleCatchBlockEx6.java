//6.Example of Java Exception Handling.In this example we use java try block with Multiple-catch block.To handle the exception without maintaining the order of exceptions.
//(i.e from most specific to most general).
public class MultipleCatchBlockEx6{
 public static void main(String args[]){
	 try{
		 int a[]=new int[5];
		 a[5]=30/0;
 }catch(Exception e){
	  System.out.println("Common task is completed..");
 }
  catch(ArithmeticException e){
	  System.out.println("Task 1 is completed..");
 }
  catch(ArrayIndexOutOfBoundsException e){
	  System.out.println("Task 2 is completed..");
 }
 System.out.println("Rest of the code is executed..");//compile time error
 }
}

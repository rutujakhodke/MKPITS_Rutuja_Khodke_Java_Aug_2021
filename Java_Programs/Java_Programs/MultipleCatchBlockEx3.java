//3.Example of Java Exception Handling.In this example we use java try block with Multiple-catch block.Try block contains 2 exceptions.But at a time only one exception occurs and corresponding
//catch block is invoked.
public class MultipleCatchBlockEx3{
 public static void main(String args[]){
	 try{
		 int a[]=new int[5];
		 a[5]=30/0;
	 System.out.println(a[11]);
 }catch(ArithmeticException e){
	 System.out.println("Arithmetic Exception occurs..");
 }
  catch(ArrayIndexOutOfBoundsException e){
	 System.out.println("ArrayIndexOutOfBounds Exception oocurs..");
 }
  catch(Exception e){
	 System.out.println("Parent exception occurs..");
 }
  System.out.println("Rest of the is executed..");
 }
}

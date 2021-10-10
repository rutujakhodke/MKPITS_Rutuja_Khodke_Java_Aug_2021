//1.Example of Java Exception Handling.In this example we use java Multiple-catch block.
public class MultipleCatchBlockEx1{
 public static void main(String args[]){
	 try{
		 int a[]=new int[10];//Array position starts with 0,so its elements is 0 to 9
		 a[10]=20/0;
 }catch(ArithmeticException e){
	 System.out.println("Arithmetic Exception occurs..");
 }
  catch(ArrayIndexOutOfBoundsException e){
	 System.out.println("ArrayIndexOutOfBounds Exception occurs..");
 }
  catch(Exception e){
	 System.out.println("Parent Exception occurs..");
 }
  System.out.println("Rest of the code is executed..");
 }
}
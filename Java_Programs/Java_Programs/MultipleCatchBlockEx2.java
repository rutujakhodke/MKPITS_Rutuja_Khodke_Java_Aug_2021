//2.Example of Java Exception Handling.In this example we use java try block with Multiple-catch block.
public class MultipleCatchBlockEx2{
 public static void main(String args[]){
	 try{
		 int arr[]=new int[5];
		 System.out.println(arr[10]);
  }catch(ArithmeticException e){
	  System.out.println("Arithmetic Exception occurs..");
  }
   catch(ArrayIndexOutOfBoundsException e){
	   System.out.println("ArrayIndexOutOfBounds Exception occurs..");
  }
   catch(Exception e){
	   System.out.println("Parent class Exception occurs");
  }
   System.out.println("Rest of the code is executed..");
 }
}

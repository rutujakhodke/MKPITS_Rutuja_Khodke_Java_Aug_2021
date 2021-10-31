//4.Example of Java Exception Handling.In this example we use java try block with Multiple-catch block.
public class MultipleCatchBlockEx4{
 public static void main(String args[]){
	 try{
		 int a[]=new int[5];
		 a[5]=30/0;
		System.out.println(a[10]);
  }catch(ArithmeticException e){
	  System.out.println("Arithmetic Exception occurs..");
	   int a1[]=new int[5];
	   try{
		   a1[5]=30;
  }
  catch(ArrayIndexOutOfBoundsException e1){
	  System.out.println("ArrayIndexOutOfBounds Exception occurs..");
  }
 }
 System.out.println("Rest of the code is executed..");
 }
}


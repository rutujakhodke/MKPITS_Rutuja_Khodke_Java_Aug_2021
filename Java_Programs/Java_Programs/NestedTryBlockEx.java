//1.Java Nested Try block Example.
public class NestedTryBlockEx{
 public static void main(String args[]){
	 try{
		 try{
			System.out.println("It going to divide the number");
			 int a=20/0;
	}catch(ArithmeticException e){
		System.out.println("Arithmetic Exception occurs..");
	}
	     try{
			 int a[]=new int[5];
			 a[5]=4;
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("ArrayIndexOutOfBounds Exception occurs..");
	}
 System.out.println("Other statement to be executed..");
    }catch(Exception e){
		System.out.println("Parent exception occurs...");
	}
	System.out.println("Rest of the code is executed..");
 }
}

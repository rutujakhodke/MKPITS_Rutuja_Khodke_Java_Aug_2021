//1.Example of Java Finally block,where exception doesn't occur.
public class FinallyBlockEx1{
 public static void main(String args[]){
	 try{
		 int data=20/2;
		System.out.println(data);
	}catch(NullPointerException e){
		System.out.println("NullPointer Exception occurs..");
	}
	finally{
		System.out.println("Finally block is always executed..");
	}
	System.out.println("Rest of the code is executed..");
 }
}
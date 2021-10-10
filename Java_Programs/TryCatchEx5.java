//15.Example of Java Exception Handling.To resolve the exception in a catch block.
public class TryCatchEx5{
 public static void main(String args[]){
	 int i=30;
	 int j=0;
	 int data;
	 try{
		 data=i/j;//may throw an exception
	}catch(Exception ee){
	  System.out.println(i/(j+2));
	  System.out.println("ArithmeticException is resolved in catch block");
	}
	System.out.println("Rest of the code is executed..");
  }
}
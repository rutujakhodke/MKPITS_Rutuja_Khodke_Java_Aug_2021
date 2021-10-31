//2.Java Finally block Example ,where exception occurs and not handled.
public class FinallyBlockEx2{
 public static void main(String args[]){
	 try{
		 int a=20/0;
		System.out.println("Result is :"+a);
  }catch(NullPointerException e){
	  System.out.println("NullPointer Exception occurs..");
  }
   finally{
	    System.out.println("Finally block is always executed..");
  }
  System.out.println("Rest of the code is executed..");
 }
}
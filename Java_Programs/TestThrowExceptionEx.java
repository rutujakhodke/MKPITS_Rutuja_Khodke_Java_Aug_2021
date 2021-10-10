//1.Java Throw keyword Exception Example.
public class TestThrowExceptionEx{
  static void validate(int age) throws Exception {
	  if(age<18)
		 throw new Exception("Not eligible to Vote!");

	 else
		  System.out.println("Eligible to vote");

	  }
	public static void main(String args[]) throws Exception {
		try{
			validate(15);
	}catch(ArithmeticException ee){
		System.out.println(ee.toString());
	}
	//System.out.println("Rest of the code is executed..");
 }
}

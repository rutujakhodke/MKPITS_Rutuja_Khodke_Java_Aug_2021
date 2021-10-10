//13.Example of Java Exception Handling.we handle the exception using the parent class exception.
public class TryCatchEx3{
 public static void main(String args[]){
	try{
		int n1=10;
		int n2=0;
		int res=0;
		res=n1/n2;
	}
  catch(Exception ee){
	 System.out.println(ee);
	}
 System.out.println("Rest of the program will be executed");
 }
}
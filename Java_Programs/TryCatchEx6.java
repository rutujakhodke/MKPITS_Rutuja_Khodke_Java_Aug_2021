//16.Example of Java Exception Handling.Along with the try block we also enclose exception code in a catch block.
public class TryCatchEx6{
 public static void main(String args[]){
	 try{
		 int data1=20/0;//may throw an exception
	 }catch(Exception ee){
		  int data2=10/0;//generating exception code in a catch block
	//catch block didn't contain the exception code.It will only handle the Exception
	 }
	 System.out.println("Rest of the code is executed...");
 }
}
//18.Example of Java Exception Handling.To handle another Unchecked Exception.
public class TryCatchEx8{
 public static void main(String args[]){
	 try{
		 int arr[]={1,3,5,7};
		System.out.println(arr[7]);
	}catch(ArrayIndexOutOfBoundsException e){
	  System.out.println(e);
	}
	System.out.println("Bye from Try-catch block exception...");
 }
}
//8.Java Finally Block Example.
public class FinallyExample{
 public static void main(String args[]){
	 try{
		 int n=100;
 }catch(Exception e){
	 System.out.println(e);
 }
  finally{
	    System.out.println("Finally block is always executed");
  }
 }
}
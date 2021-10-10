//19.Example of Java Exception Handling.To handle checked exception.
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class TryCatchEx9{
 public static void main(String args[]){
	 PrintWriter pw;
	 try{
		 pw=new PrintWriter("f:\\ioex\\file123.txt");//may throw exception
		 pw.println("File saved");
	 }catch(FileNotFoundException e){//providing the checked exception handler
		 System.out.println(e);
	 }
	System.out.println("File saved Successfully..");
 }
}
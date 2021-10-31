//1.Example of Java PrintStream class.In this example we are simply printing integer and string value.
import java.io.FileOutputStream;
import java.io.PrintStream;
class PrintStreamEx{
 public static void main(String args[])throws Exception{
 FileOutputStream fos=new FileOutputStream("f:\\ioex\\iofileps.text");
 PrintStream ps=new PrintStream(fos);
 ps.println(2021);
 ps.println("Hello Java!!");
 ps.println("Welcome to Java..");
 fos.close();
 ps.close();
 System.out.println("Printing of Data is Successful..");
 }
}
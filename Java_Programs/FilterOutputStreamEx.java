//1.Example of FilterOutputStream class.
import java.io.*;
class FilterOutputStreamEx{
public static void main(String args[])throws Exception{
File data=new File("f:\\ioex\\iofile4.txt");
FileOutputStream file=new FileOutputStream(data);
FilterOutputStream filter=new FilterOutputStream(file);
String str="Example of Filter Output Stream class..";
byte b[]=str.getBytes();
filter.write(b);
filter.flush();
filter.close();
file.close();
System.out.println("Success...");
 }
}
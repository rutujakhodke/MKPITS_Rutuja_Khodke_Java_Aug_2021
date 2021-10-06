//1.Example of CharArrayWriter class.
import java.io.CharArrayWriter;
import java.io.FileWriter;
class CharArrayWriterEx{
 public static void main(String args[])throws Exception{
 CharArrayWriter caw=new CharArrayWriter();
 caw.write("It is a CharArrayWriter class...");
 FileWriter fw1=new FileWriter("f:\\ioex\\charf1.txt");
 FileWriter fw2=new FileWriter("f:\\ioex\\charf2.txt");
 FileWriter fw3=new FileWriter("f:\\ioex\\charf3.txt");
 FileWriter fw4=new FileWriter("f:\\ioex\\charf4.txt");
 caw.writeTo(fw1);
 caw.writeTo(fw2);
 caw.writeTo(fw3);
 caw.writeTo(fw4);
 fw1.close();
 fw2.close();
 fw3.close();
 fw4.close();
 caw.close();
 System.out.println("Common Data written into files..");
 }
}

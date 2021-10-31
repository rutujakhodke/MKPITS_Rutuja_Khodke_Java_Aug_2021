//2.Example of Java BufferedReader class.
import java.io.*;
class BufferedReaderEx{
public static void main(String args[])throws Exception{
FileReader reader=new FileReader("f:\\ioex\\iofile5.txt");
BufferedReader buffer=new BufferedReader(reader);
 int i;
 while((i=buffer.read())!=-1){
 System.out.print((char) i);
 }
 buffer.close();
 reader.close();
 System.out.println("Data read from file Successfully..");
 }
}

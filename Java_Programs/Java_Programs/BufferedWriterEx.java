//1.Example of Java BufferedWriter class.
import java.io.*;
class BufferedWriterEx{
public static void main(String args[])throws IOException{
FileWriter writer=new FileWriter("f:\\ioex\\iofile5.txt");
BufferedWriter buffer=new BufferedWriter(writer);
buffer.write("Welcome to Java programming classes..");
buffer.close();
writer.close();
System.out.println("Data written in file Successfully..");
 }
}
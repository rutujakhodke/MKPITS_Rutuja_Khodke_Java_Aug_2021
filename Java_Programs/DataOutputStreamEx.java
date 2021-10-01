//1.Example of DataOutputStream class.
import java.io.*;
class DataOutputStreamEx{
public static void main(String args[])throws IOException{
FileOutputStream file=new FileOutputStream("f:\\ioex\\iofile3.txt");
DataOutputStream data=new DataOutputStream(file);
 data.writeInt(67);
 data.flush();
 data.close();
 file.close();
 System.out.println("Data written successfully.");
 }
}
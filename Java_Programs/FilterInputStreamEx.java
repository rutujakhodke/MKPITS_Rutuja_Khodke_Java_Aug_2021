//2.Example of FilterInputStream class.
import java.io.*;
class FilterInputStreamEx{
public static void main(String args[])throws IOException{
FileInputStream file=new FileInputStream("f:\\ioex\\iofile4.txt");
FilterInputStream filter=new BufferedInputStream(file);
 int k=0;
 while((k=filter.read())!=-1){
 System.out.print((char) k);
  }
 filter.close();
 file.close();
 }
}

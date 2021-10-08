//1.Example of Java StringWriter class.
import java.io.*;
class StringWriterEx{
 public static void main(String args[])throws Exception{
 char arr[]=new char[512];
 StringWriter sw=new StringWriter();
 FileInputStream input=null;
 BufferedReader buffer=null;
 input=new FileInputStream("f:\\ioex\\file1.txt");
 buffer=new BufferedReader(new InputStreamReader(input,"UTF-8"));
 int x;
 while((x=buffer.read(arr))!=-1){
    sw.write(arr,0,x);
 }
 System.out.println(sw.toString());
 sw.close();
 buffer.close();
 }
}
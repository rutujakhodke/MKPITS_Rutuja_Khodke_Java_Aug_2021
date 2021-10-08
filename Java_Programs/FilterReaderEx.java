//1.Example of Java FilterReader class.
import java.io.*;
class CustomFilterReader extends FilterReader{
 CustomFilterReader(Reader in){
  super(in);
 }
 public int read() throws IOException{
  int x=super.read();
  if ((char) x == ' ')
     return ((int) '?');
  else
     return x;

 }
}
class FilterReaderEx{
 public static void main(String args[]){
 try{
    Reader reader=new FileReader("f:\\ioex\\file1.txt");
    CustomFilterReader cfr=new CustomFilterReader(reader);
    int i;
    while((i=cfr.read())!=-1){
     System.out.print((char) i);
    }
    cfr.close();
    reader.close();
  }catch(Exception e){
   e.getMessage();
  }
 }
}
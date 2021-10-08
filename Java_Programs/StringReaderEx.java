//1.Example of Java StringReader class.
import java.io.StringReader;
class StringReaderEx{
 public static void main(String args[])throws Exception{
 String str="Hello Java!!\nWelcome to MKPITS...";
 StringReader sr=new StringReader(str);
 int i;
 while((i=sr.read())!=-1){
  System.out.print((char) i);
  }
 }
}
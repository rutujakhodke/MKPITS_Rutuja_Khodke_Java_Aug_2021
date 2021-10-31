//1.Example of PushbackInputStream class.
import java.io.*;
class PushbackInputStreamEx{
public static void main(String args[])throws Exception{
String str="1##2#34###12";
byte ary[]=str.getBytes();
ByteArrayInputStream array=new ByteArrayInputStream(ary);
PushbackInputStream pis=new PushbackInputStream(array);
int i;
 while((i=pis.read())!=-1){
  if(i=='#'){
   int j;
    if((j=pis.read())=='#'){
     System.out.print("**");
    }
    else{
     pis.unread(j);
     System.out.print((char) i);
    }
  }
  else{
   System.out.print((char) i);
   }
  }
 }
}
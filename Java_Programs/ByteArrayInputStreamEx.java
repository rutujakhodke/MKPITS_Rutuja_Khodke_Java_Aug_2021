//2.Example of ByteArrayInputStream class.
import java.io.*;
class ByteArrayInputStreamEx{
public static void main(String args[])throws Exception{
byte[] buf={65,66,67,68,69};
//create a new byte array input stream
ByteArrayInputStream byt=new ByteArrayInputStream(buf);
 int k=0;
 while((k=byt.read())!=-1){
  //conversion of byte into character
  char ch=(char) k;
  System.out.println("ASCII value of Character is :" +k+ ";Special character is : "+ch);
  }
 }
}
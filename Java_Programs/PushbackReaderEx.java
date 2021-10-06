//1.Example of PushbackReader class.
import java.io.*;
class PushbackReaderEx{
 public static void main(String args[])throws Exception{
 char arr[]={'1','-','-','2','-','3','4','-','-','-','5','6'};
 CharArrayReader array=new CharArrayReader(arr);
 PushbackReader push=new PushbackReader(array);
  int i;
  while((i=push.read())!=-1){
   if(i=='-'){
    int j;
    if((j=push.read())=='-'){
     System.out.print("#*");
    }
    else{
     push.unread(i);//push back single character
     System.out.print((char) i);
     }
    }
   else{
    System.out.print((char) i);
    }
   }
  }
}
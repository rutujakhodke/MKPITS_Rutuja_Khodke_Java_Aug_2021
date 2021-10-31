//2.Example of CharArrayReader class.
import java.io.CharArrayReader;
class CharArrayReaderEx{
 public static void main(String args[])throws Exception{
 char[] arr={'J','a','v','a','C','h','a','r','A','r','r','a','y','R','e','a','d','e','r'};
 CharArrayReader car=new CharArrayReader(arr);
 int i=0;
  while((i=car.read())!=-1){
   char ch=(char)i;
   System.out.print(ch+" : ");
   System.out.println(i);
  }
  car.close();
 }
}

//1.Example of FileReader class.we are reding the data from the text file using java FileReader class.
import java.io.FileReader;
class FileReaderEx{
 public static void main(String args[])throws Exception{
FileReader fr=new FileReader("f://myfile1.txt");
 int i;
 while((i=fr.read())!=-1)
  System.out.print((char) i);

 fr.close();
 }
}
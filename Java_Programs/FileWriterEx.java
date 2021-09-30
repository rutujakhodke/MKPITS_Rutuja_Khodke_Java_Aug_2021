//2.Example of Java FileWriter .we are writing the data in the file using file writer class.
import java.io.FileWriter;
class FileWriterEx{
 public static void main(String args[]){
 try{
  FileWriter fw=new FileWriter("f://myfile1.txt");
  fw.write("Hello from File Writer class...!");
  fw.close();
  }catch(Exception e){
  System.out.println(e);
 }
 System.out.println("Data written in file Successfully.");
}
}
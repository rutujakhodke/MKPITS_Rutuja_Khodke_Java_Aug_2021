//1.Example of Java FilterWriter.
import java.io.*;
class CustomFilterWriter extends FilterWriter{
 CustomFilterWriter(Writer out){
  super(out);
 }
 public void write(String str)throws IOException{
  super.write(str.toLowerCase());
 }
}
class FilterWriterEx{
 public static void main(String args[]){
  try{
      FileWriter fw=new FileWriter("f:\\ioex\\file1.txt");
      CustomFilterWriter cfw=new CustomFilterWriter(fw);
      cfw.write("I LOVE MY COUNTRY");
      cfw.close();
      FileReader fr=new FileReader("f:\\ioex\\file1.txt");
      BufferedReader br=new BufferedReader(fr);
      int k;
      while((k=br.read())!=-1){
       System.out.print((char) k);
      }
    br.close();
  }catch(Exception e){
   e.printStackTrace();
  }
 }
}
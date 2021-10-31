//1.Example of Java PrintWriter class.In this eg, we writing the data on a console and in a text file .
import java.io.File;
import java.io.PrintWriter;
class PrintWriterEx{
 public static void main(String args[]){
 try{
 //write a data on console using PrintWriter class
 PrintWriter pw=new PrintWriter(System.out);
 pw.write("Welcome to MKPITS...");
 pw.flush();
 pw.close();

 //write a data into a text file using PrintWriter class
 PrintWriter pw1=null;
 pw1=new PrintWriter(new File("f:\\ioex\\filePW.txt"));
 pw1.write("It is a I/O Stream classes of Type PrintWriter class...");
 pw1.flush();
 pw1.close();
 }catch(Exception e){
  System.out.println(e);
 }
 }
}
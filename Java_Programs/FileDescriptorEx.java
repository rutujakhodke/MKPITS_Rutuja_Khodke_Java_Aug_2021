//1.Java FileDescriptor Example.
import java.io.*;
class FileDescriptorEx{
 public static void main(String args[]){
  FileDescriptor fd=null;
  byte b[]={48,49,50,51,52,53,54,55,56,57,65};
   try{
     FileOutputStream fos=new FileOutputStream("f:\\ioex\\Record.txt");
     FileInputStream fis=new FileInputStream("f:\\ioex\\Record.txt");
     fd=fos.getFD();
     fos.write(b);
     fos.flush();
     fd.sync();//confirms data to be written to the disk
     int value=0;
     //for every available bytes
     while((value=fis.read())!=-1){
      char ch=(char)value;//converts byte to char
      System.out.print(ch);
     }
    System.out.println("\n Sync() successfully executed!!");
   }catch(Exception e){
    e.printStackTrace();
   }
 }
}
//1.Java File Example.
import java.io.*;
class FileEx{
  public static void main(String args[]){
   try{
      File file=new File("f:\\ioex\\javaFile.txt");
      if(file.createNewFile()){
       System.out.println("New File is created.");
      }
     else{
      System.out.println("File already exists.");
     } 
   }catch(Exception e){
    e.printStackTrace();
   }
 }
}
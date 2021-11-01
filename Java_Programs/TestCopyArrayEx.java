//5.Java program to copy a source array into a destination array in java.
public class TestCopyArrayEx{
 public static void main(String args[]){
 //declaring a source array
 char[] copyFrom={'w','e','l','c','o','m','e','t','o','m','k','p','i','t','s'};
 //declaring a destination array
 char[] copyTo=new char[9];
 //copying a array into destination using System.arraycopy() method
 System.arraycopy(copyFrom,3,copyTo,0,9);
 //printing the destination array
 System.out.println(String.valueOf(copyTo));
 }
}
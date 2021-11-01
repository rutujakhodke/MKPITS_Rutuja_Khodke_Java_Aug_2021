//4.Java program to get the class name of array in Java.
public class TestArrayNameEx{
 public static void main(String args[]){
 //declaring and initailizing of array
 int[] arr={3,4,5};
 //getting the class name of array
 Class c=arr.getClass();
 String name=c.getName();
 //printing the class name of array
 System.out.println(name);
 }
}
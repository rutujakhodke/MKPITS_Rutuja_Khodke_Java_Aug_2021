//4.Java ArrayList Example.Iterating ArrayList using Iterator.
import java.util.*;
public class TestArrayListEx4{
 public static void main(String args[]){
 ArrayList<String> arr=new ArrayList<String>();
 arr.add("Rohit");
 arr.add("Aman");
 arr.add("Raj");
 Iterator itr=arr.iterator();//getting the iterator
  while(itr.hasNext()){
   System.out.println("Student Name ="+itr.next());
  }
 }
}

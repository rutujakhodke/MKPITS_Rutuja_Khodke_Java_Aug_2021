//1.Java HashSet example.The elements iterate in an unordered collection.
import java.util.*;
public class TestHashSetEx1{
 public static void main(String args[]){
 //creating Hashset and adding elements in it
 HashSet<String>set=new HashSet<String>();
 set.add("One");
 set.add("Two");
 set.add("Three");
 set.add("Four");
 set.add("Five");
 //traverse the Hashset elements
 Iterator<String> itr=set.iterator();
   while(itr.hasNext()){
   System.out.println("HashSet elements are ="+itr.next());
   }
 }
}
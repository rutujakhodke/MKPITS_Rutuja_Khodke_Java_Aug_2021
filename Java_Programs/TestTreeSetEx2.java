//2.Java TreeSet example.Traversing elements in an descending order.
import java.util.*;
public class TestTreeSetEx2{
 public static void main(String args[]){
 TreeSet<String> set=new TreeSet<String>();
 set.add("Ravi");
 set.add("Vijay");
 set.add("Sumit");
 set.add("Raj");
 //traversing elements through iterator
 System.out.println("Traversing element through Iterator in descending order :");
 Iterator<String> itr=set.descendingIterator();
  while(itr.hasNext()){
  System.out.println(itr.next());
  }
 }
}
//1.Java LinkedHashSet example.The elements iterate in insertion order(It maintains insertion order).
import java.util.*;
public class TestLinkedHashSetEx1{
 public static void main(String args[]){
 LinkedHashSet<String> set=new LinkedHashSet<String>();
 set.add("One");
 set.add("Two");
 set.add("Three");
 set.add("Four");
 set.add("Five");

 //traverse the linkedhashset elements
 Iterator<String> itr=set.iterator();
  while(itr.hasNext()){
  System.out.println(itr.next());
  }
 }
}
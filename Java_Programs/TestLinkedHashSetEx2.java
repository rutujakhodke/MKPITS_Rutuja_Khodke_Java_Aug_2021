//2.Java LinkedHashSet example.It ignores duplicate elements.
import java.util.*;
public class TestLinkedHashSetEx2{
 public static void main(String args[]){
 LinkedHashSet<String> set=new LinkedHashSet<String>();
 set.add("Ajay");
 set.add("Raj");
 set.add("Sumit");
 set.add("Raj");
 set.add("Vijay");
 //traverse the elements of linkedHashSet
 Iterator<String> itr=set.iterator();
  while(itr.hasNext()){
  System.out.println(itr.next());
  }
 }
}
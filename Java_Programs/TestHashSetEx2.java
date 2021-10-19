//2.Java HashSet example.We see that HashSet doesn't allow duplicate elements.
import java.util.*;
public class TestHashSetEx2{
 public static void main(String args[]){
 HashSet<String> set=new HashSet<String>();
 set.add("Ravi");
 set.add("Vijay");
 set.add("Ravi");
 set.add("Ajay");
 //traverse the elements
 Iterator<String> itr=set.iterator();
  while(itr.hasNext()){
  System.out.println(itr.next());
  }
 }
}
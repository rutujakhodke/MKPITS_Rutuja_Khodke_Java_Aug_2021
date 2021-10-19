//4.Java HashSet example.Java HashSet from another collection.
import java.util.*;
public class TestHashSetEx4{
 public static void main(String args[]){
 ArrayList<String> list=new ArrayList<String>();
 list.add("Ravi");
 list.add("Vijay");
 list.add("Sumit");

 HashSet<String> set=new HashSet<String>(list);//passing ArrayList in hashset
 set.add("Raj");
 //Traverse the elements
 Iterator<String> itr=set.iterator();
  while(itr.hasNext()){
   System.out.println(itr.next());
  }
 }
}
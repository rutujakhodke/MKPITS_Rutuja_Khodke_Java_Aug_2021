//1.Java TreeSet example.TreeSet class maintains ascending order
import java.util.*;
public class TestTreeSetEx1{
 public static void main(String args[]){
 //creating TreeSet and adding elements
 TreeSet<String> set=new TreeSet<String>();
 set.add("Ravi");
 set.add("Ajay");
 set.add("Raj");
 set.add("Sumit");
 set.add("Raj");
 System.out.println("Iterating TreeSet Elements in Ascending Order");
 //traverse the elements
 Iterator<String> itr=set.iterator();
  while(itr.hasNext()){
  System.out.println(itr.next());
  }
 }
}
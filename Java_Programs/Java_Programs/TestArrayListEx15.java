//13.Java ArrayList Example.retainAll() method.
import java.util.*;
public class TestArrayListEx15{
 public static void main(String args[]){
 ArrayList<String> list1=new ArrayList<String>();
 list1.add("Ravi");
 list1.add("Ajay");
 list1.add("Vijay");

 ArrayList<String> list2=new ArrayList<String>();
 list2.add("Ravi");
 list2.add("Anuj");
 list1.retainAll(list2);
 System.out.println("Iterating the elements after retaining the elements of list2");
 Iterator itr=list1.iterator();
  while(itr.hasNext()){
	System.out.println(itr.next());//it prints the common elements in both the arraylist
  }
 }
}
//3.Java HashSet example to remove elements.We see different ways to remove an element.
import java.util.*;
public class TestHashSetEx3{
 public static void main(String args[]){
 HashSet<String> set=new HashSet<String>();
 set.add("Ajay");
 set.add("Ravi");
 set.add("Amit");
 set.add("Sumit");
 set.add("Raj");
 System.out.println("An Initial list of elements are ="+set);

 //remove an specific element from set
 set.remove("Amit");
 System.out.println("After invoking remove() method set is ="+set);

 HashSet<String> set1=new HashSet<String>();
 set1.add("Neel");
 set1.add("Harsh");
 //adding set1 elements into current set
 set.addAll(set1);
 System.out.println("Updated set is ="+set);

 //remove all new elements from HashSet
 set.removeAll(set1);
 System.out.println("After invoking removeAll() method set is ="+set);

 //remove element on the basis of specific condition
 set.removeIf(str -> str.contains("Sumit"));
 System.out.println("After invoking removeIf() method set is ="+set);

 //removing all the elements from the set
 set.clear();
 System.out.println("After invoking clear() method set is ="+set);
 }
}
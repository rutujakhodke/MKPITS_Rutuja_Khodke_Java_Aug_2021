//13.Java ArrayList Example to remove elements.We see different ways to remove an elements.
import java.util.*;
public class TestArrayListEx14{
 public static void main(String args[]){
 ArrayList<String> list1=new ArrayList<String>();
 list1.add("Amit");
 list1.add("Raj");
 list1.add("Aman");
 list1.add("Rohit");
 list1.add("Tushar");
 System.out.println("An initial list elements are ="+list1);

 //removing an specific element from arraylist
 list1.remove("Aman");
 System.out.println("After invoking remove() method list is ="+list1);

 //removing an element with the specific position from arraylist
 list1.remove(3);
 System.out.println("After invoking remove() method with specific index position list is ="+list1);

 //creating new ArrayList
 ArrayList<String> list2=new ArrayList<String>();
 list2.add("Anuj");
 list2.add("Ajit");
 //adding new elements into  ArrayList
 list1.addAll(list2);
 System.out.println("After adding some elements in a ArrayList,Updated list is ="+list1);

 //Removing all new elements from ArrayList
 list1.removeAll(list2);
 System.out.println("After invoking removeAll() method list is ="+list1);

 //removing an element with a specific condition
 list1.removeIf(str -> str.contains("Rohit"));//using lambda expression
 System.out.println("After invoking removeIf() method list is ="+list1);

 //removing all elements from arraylist
 list1.clear();
 System.out.println("After invoking clear() method list is ="+list1);
 }
}


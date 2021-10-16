//3.Java LinkedList Example to remove elements.we see different ways to remove an element.
import java.util.*;
public class TestLinkedListEx3{
 public static void main(String args[]){
 LinkedList<String> list1=new LinkedList<String>();
 list1.add("Amit");
 list1.add("Harsh");
 list1.add("Gaurav");
 list1.add("Ajay");
 list1.add("Rajesh");
 list1.add("Ram");
 list1.add("Amit");
 list1.add("Vijay");
 list1.add("Anuj");
 list1.add("Piyush");
 System.out.println("Initial list of elements are ="+list1);

 //removing an specific element from a list
 list1.remove("Gaurav");
 System.out.println("After invoking remove() method list is ="+list1);

 //removing an element on a basis of specific index position
 list1.remove(1);
 System.out.println("After invoking remove() method list is ="+list1);

 //creating another list
 LinkedList<String> list2=new LinkedList<String>();
 list2.add("Aman");
 list2.add("Yojit");
 //adding an element in a list1 of LinkedList
 list1.addAll(list2);
 System.out.println("After invoking addAll() method ,updated list is ="+list1);

 //removing all new new elements from list
 list1.removeAll(list2);
 System.out.println("After invoking removeAll() method list is ="+list1);

 //remove an first element from list
 list1.removeFirst();
 System.out.println("After invoking removeFirst() method list is ="+list1);

 //removing an last element from a list
 list1.removeLast();
 System.out.println("After invoking removeLast() method list is ="+list1);

 //removing first occurence element from a list
 list1.removeFirstOccurrence("Vijay");
 System.out.println("After invoking removeFirstOccurence() method list is ="+list1);

 //removing last occurence element from a list
 list1.removeLastOccurrence("Ram");
 System.out.println("After invoking removeLastOccurrence() method list is ="+list1);

 //removing all elements from a list
 list1.clear();
 System.out.println("After invoking clear() method list is ="+list1);
 }
}
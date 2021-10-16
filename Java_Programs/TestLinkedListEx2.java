//2.Java LinkedList Example to add elements.We see different ways to add elements.
import java.util.*;
public class TestLinkedListEx2{
 public static void main(String args[]){
 LinkedList<String> list=new LinkedList<String>();
 System.out.println("Initial list of elements ="+list);

 //adding objects in a Likedlist
 list.add("Anuj");
 list.add("Raj");
 list.add("Vijay");
 list.add("Amit");
 System.out.println("After invoking the add() method list is ="+list);

 //adding elements in a list at a specific position
 list.add(2,"Manit");
 System.out.println("After invoking the add() method at a specific position list is ="+list);

 LinkedList<String> list1=new LinkedList<String>();
 list1.add("Akshay");
 list1.add("Ram");
 //adding element of a 2nd list into a 1st Linkedlist
 list.addAll(list1);
 System.out.println("After invoking the addAll() method list is ="+list);

 LinkedList<String> list2=new LinkedList<String>();
 list2.add("Ajay");
 list2.add("Sagar");
 //adding the 3rd list elements into 1st list at a specific position
 list.addAll(2,list2);
 System.out.println("After invoking the addAll() method at a specific position list is ="+list);

 //adding an element at a first position
 list.addFirst("Piyush");
 System.out.println("After invoking the addFirst() method list is ="+list);

 //adding an element at a last position
 list.addLast("Ramesh");
 System.out.println("After invoking the addLast() method list is ="+list);
 }
}

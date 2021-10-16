//13.Java ArrayList Example to add elements.We see different ways to add an elements.
import java.util.*;
public class TestArrayListEx13{
 public static void main(String args[]){
 ArrayList<String> list=new ArrayList<String>();
 System.out.println("Initial Elements of a list are ="+list);

 //adding elements to the end of the list
 list.add("Amit");
 list.add("Raj");
 list.add("Sumit");
 System.out.println("After invoking add() method list are ="+list);

 //adding elements at the specific index position of the arraylist
 list.add(1,"Manit");
 System.out.println("After invoking add(int index,String s) method list are ="+list);

 //creating another arraylist
 ArrayList<String> list1=new ArrayList<String>();
 list1.add("John");
 list1.add("Rahul");
 //adding elements of 2nd list into 1st arraylist
 list.addAll(list1);
 System.out.println("After invoking addAll() method list are ="+list);

 //creating another ArrayList
 ArrayList<String> list2=new ArrayList<String>();
 list2.add("Praful");
 list2.add("Sahil");
 //adding elements of 3rd list into 1st Arraylist with specific index position
 list.addAll(2,list2);
 System.out.println("After invoking addAll() method with specific index position list are :"+list);
 }
}
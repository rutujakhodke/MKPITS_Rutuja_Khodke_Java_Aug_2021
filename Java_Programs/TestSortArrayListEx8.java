//8.Java ArrayList Example.Sorting the ArrayList.
import java.util.*;
public class TestSortArrayListEx8{
  public static void main(String args[]){
  ArrayList<String> list1=new ArrayList<String>();//creating a list of fruits
  list1.add("Mango");
  list1.add("Grapes");
  list1.add("Apple");
  list1.add("Banana");
  //sorting the list1
  Collections.sort(list1);
  //traverse the arraylist through for-each loop
  for(String fruit:list1)
  System.out.println("Fruit name is :"+fruit);

  //creating a list of numbers
  System.out.println("Sorting the numbers...");
  ArrayList<Integer> list2=new ArrayList<Integer>();
  list2.add(12);
  list2.add(45);
  list2.add(4);
  list2.add(23);
  Collections.sort(list2);
  for(Integer number:list2)
  System.out.println("Numbers are :"+number);
 }
}
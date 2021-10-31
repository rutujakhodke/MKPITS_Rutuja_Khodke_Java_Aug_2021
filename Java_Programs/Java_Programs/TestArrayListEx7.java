//7.Java ArrayList Example.Iterating ArrayList using for-each loop.
import java.util.*;
public class TestArrayListEx7{
  public static void main(String args[]){
  ArrayList<String> arr=new ArrayList<String>();
  arr.add("Mango");
  arr.add("Apple");
  arr.add("Grapes");
  arr.add("Banana");
  //traversing arrylist through for-each loop
  for(String fruit:arr)
  System.out.println("Fruit names :"+fruit);
 }
}
//5.Java ArrayList Example.Get and set arrylist.
import java.util.*;
public class TestArrayListEx5{
  public static void main(String args[]){
  ArrayList<String> arr=new ArrayList<String>();
  arr.add("Mango");
  arr.add("Grapes");
  arr.add("Orange");
  arr.add("Banana");
  //getting the elements using get() method
  System.out.println("Returning the element :"+arr.get(2));//it will return 3rd position element
  //because index start from 0
  //changing the element
  arr.set(1,"Apple");
  //traverse the array
  for(String fruit:arr)//for each loop
  System.out.println("Fruit Names :"+fruit);
 }
}

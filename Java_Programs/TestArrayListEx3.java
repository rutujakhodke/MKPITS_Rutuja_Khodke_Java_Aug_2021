//3.Java ArrayList Example.Iterating ArrayList using Iterator.
import java.util.*;
public class TestArrayListEx3{
 public static void main(String args[]){
 ArrayList<String> list=new ArrayList<String>();//creating ArrayList
 list.add("Mango");//Adding object in a arraylist
 list.add("Grapes");
 list.add("Orange");
 list.add("Banana");
 //traversing arraylist element through iterator
 Iterator itr=list.iterator();//getting Iterator
  while(itr.hasNext()){//it checks the iterator has the elements
   System.out.println(itr.next());//printing the element and move to next
  }
 }
}

//4.Java LinkedList Example to reverse a list of elements.
import java.util.*;
public class TestLinkedListEx4{
 public static void main(String args[]){
 LinkedList<String> list=new LinkedList<String>();
 list.add("Ajay");
 list.add("Ram");
 list.add("Suraj");
 //traverse a list of elements in a reverse order
 Iterator itr=list.descendingIterator();//getting iterator
  while(itr.hasNext()){
   System.out.println("Student name is ="+itr.next());
  }
 }
}

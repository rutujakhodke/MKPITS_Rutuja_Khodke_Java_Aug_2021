//9.Java ArrayList Example.Iterating ArrayList using ListIterator and for loop.
import java.util.*;
public class TestArrayListEx9{
  public static void main(String args[]){
  ArrayList<String> list=new ArrayList<String>();
  list.add("Ravi");
  list.add("Vijay");
  list.add("Ajay");
  list.add("Raj");
  System.out.println("Traverse the list through ListIterator");
  ListIterator<String> list1=list.listIterator(list.size());//here elements iterate through reverse order
    while(list1.hasPrevious()){
     String str=list1.previous();
     System.out.println(str);
    }
   System.out.println("Traverse the list through for loop");
   for(int i=0;i<list.size();i++){
  System.out.println(list.get(i));
  }
 }
}
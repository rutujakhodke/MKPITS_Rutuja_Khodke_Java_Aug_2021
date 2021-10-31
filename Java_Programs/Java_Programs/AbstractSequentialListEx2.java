//2.Java Collection AbstractSequentialList example.Methods of AbstractSequentialList class.
import java.util.*;
import java.util.AbstractSequentialList;
public class AbstractSequentialListEx2{
 public static void main(String args[]){
 //creating an empty AbstractSequentialList
 AbstractSequentialList<String> absqlist =new LinkedList<String>();
 //adding elements in the list using add() method
 absqlist.add("Welcome");
 absqlist.add("to");
 absqlist.add("Mkpits");
 absqlist.add("Solutions");
 absqlist.add("10");
 absqlist.add("20");
 //displaying the elements
 System.out.println("AbstractSequentialList is: "+absqlist);
 
 //removing the head using remove()
 absqlist.remove(2);
 System.out.println("the head is: "+absqlist);
 
 //fetching an specific element from the list using get() method
 System.out.println("AbstractSequentialList specific element is: "+absqlist.get(0));
 }
}

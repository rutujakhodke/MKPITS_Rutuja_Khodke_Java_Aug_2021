//2.Java Collection AbstractList example.Methods of AbstractList.
import java.util.*;
public class AbstractListEx2{
 public static void main(String args[]){
 //creating a empty AbstractList
 AbstractList<String> list= new LinkedList<String>();
 //using add() method to add elements in the list
 list.add("Welcome");
 list.add("To");
 list.add("Mkpits");
 list.add("Solutions");
 list.add("30");
 list.add("10");
 //displaying the abstractlist elements
 System.out.println("AbstractList is: "+list);

 //remove the head using remove() method
 list.remove(3);
 //displaying the final list
 System.out.println("Final AbstractList is: "+list);

 //gettin the index of last occurence element using lastIndexOf() method
 int lastindex=list.lastIndexOf("Mkpits");
 //displaying the last occurence element
 System.out.println("Last Index is: "+lastindex);
 }
}

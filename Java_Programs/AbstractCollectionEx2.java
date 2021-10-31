//2.Java Collection AbstractCollection example.
import java.util.*;
import java.util.AbstractCollection;
public class AbstractCollectionEx2{
 public static void main(String args[]){
 //creating an empty collection
 AbstractCollection<String> abc1=new TreeSet<String>();
 //use add() method to adding elements in the collection
 abc1.add("Welcome");
 abc1.add("to");
 abc1.add("Mkpits");
 abc1.add("Software");
 abc1.add("Solutions");
 abc1.add("20");
 //displaying the collection
 System.out.println("AbstractCollection1: "+abc1);

 //creating another empty collection
 AbstractCollection<String> abc2=new TreeSet<String>();

 //displaying the collection
 System.out.println("AbstractCollection before adding elements: "+abc2);

//using addAll() method to append the elements
abc2.addAll(abc1);
System.out.println("AbstractCollection after adding elements: "+abc2);

//use clear() method to clear the collection
abc2.clear();
//displaying the collection
System.out.println("AbstractCollection after clearing elements: "+abc2);

//use isEmpty() to check whether collection is empty or not
System.out.println("Is the Collection is empty? "+abc2.isEmpty());
 }
}

//1.Java Collection AbstractCollection example.
import java.util.*;
import java.util.AbstractCollection;
public class AbstractCollectionEx1{
 public static void main(String args[]){
 //creating an empty collection
 AbstractCollection<Object> abc=new ArrayList<Object>();
 //using add() method to insert elements in it
 abc.add("Welcome");
 abc.add("to");
 abc.add("Mkpits");
 abc.add("Software");
 abc.add("Solutions");
 //displaying the elements
 System.out.println("AbstractCollection is: "+abc);
 }
}
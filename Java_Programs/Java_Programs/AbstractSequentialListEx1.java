//1.Java Collection AbstractSequentialList example.
import java.util.*;
public class AbstractSequentialListEx1{
 public static void main(String args[]){
 //creating an instance of AbstractSequentialList
 AbstractSequentialList<Integer> absl=new LinkedList<Integer>();
 //adding elements in the list
 absl.add(4);
 absl.add(5);
 absl.add(6);
 absl.add(7);
 //displaying the elements
 System.out.println("AbstractSequentialList is: "+absl);
 }
}
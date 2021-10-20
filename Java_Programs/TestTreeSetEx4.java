//4.Java TreeSet example.We perform various NavigableSet operations.
import java.util.*;
public class TestTreeSetEx4{
 public static void main(String args[]){
 TreeSet<String> set=new TreeSet<String>();
 set.add("A");
 set.add("B");
 set.add("C");
 set.add("D");
 set.add("E");
 System.out.println("Initial set is ="+set);

 System.out.println("Reverse order is ="+set.descendingSet());

 System.out.println("Head set is ="+set.headSet("C",true));

 System.out.println("SubSet is ="+set.subSet("A",false,"E",true));

 System.out.println("Tail set is ="+set.tailSet("B",false));
 }
}
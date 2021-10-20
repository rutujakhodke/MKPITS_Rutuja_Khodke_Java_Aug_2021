//6.Java TreeSet example.We perform various SortedeSet set operations.
import java.util.*;
public class TestTreeSetEx6{
 public static void main(String args[]){
 TreeSet<String> set=new TreeSet<String>();
 set.add("A");
 set.add("B");
 set.add("C");
 set.add("D");
 set.add("E");
 System.out.println("Intial set is ="+set);

 System.out.println("Reverse set is ="+set.descendingSet());

 System.out.println("Head set is ="+set.headSet("D"));//excluding D

 System.out.println("Sub set is ="+set.subSet("A","D"));

 System.out.println("Tail set is ="+set.tailSet("B"));//including B
 }
}

//5.Java TreeSet example.We perform various NavigableSet operations.
import java.util.*;
public class TestTreeSetEx5{
 public static void main(String args[]){
 TreeSet<String> set=new TreeSet<String>();
 set.add("mi10");
 set.add("sony");
 set.add("vivo");
 set.add("realme");
 set.add("motorola");

 System.out.println("Initial set is ="+set);

 System.out.println("Reverse set is ="+set.descendingSet());

 System.out.println("Head set is ="+set.headSet("realme",true));

 System.out.println("Sub set is ="+set.subSet("motorola",true,"sony",false));

 System.out.println("Tail set is ="+set.tailSet("motorola",false));
 }
}

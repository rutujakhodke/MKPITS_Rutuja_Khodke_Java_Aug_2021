//3.Java TreeSet example.To retrive and remove the highest and lowest value.
import java.util.*;
public class TestTreeSetEx3{
 public static void main(String args[]){
 TreeSet<Integer> set=new TreeSet<Integer>();
 set.add(20);
 set.add(55);
 set.add(4);
 set.add(34);
 set.add(12);
 System.out.println("Highest value :"+set.pollFirst());
 System.out.println("Lowest value :"+set.pollLast());
 }
}

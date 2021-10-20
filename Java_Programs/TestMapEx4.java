//4.Java Map example.comparingByKey() in Descending order.
import java.util.*;
public class TestMapEx4{
public static void main(String args[]){
Map<Integer,String> map=new HashMap<Integer,String>();
map.put(101,"Raj");
map.put(102,"Amit");
map.put(103,"Karan");
//returns a set view of mappings in this map
map.entrySet()
//returns a sequential stream of this collection as its source
.stream()
//sorted according to  provided by Comparator
.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
//performs an action for each element in this stream
.forEach(System.out::println);
 }
}


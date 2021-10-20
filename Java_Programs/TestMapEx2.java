//2.Java Map example.comparingByKey().
import java.util.*;
public class TestMapEx2{
public static void main(String args[]){
Map<Integer,String> map=new HashMap<Integer,String>();
map.put(101,"Raj");
map.put(102,"Amit");
map.put(103,"Karan");
//returns set view of the mappings contained in the map
map.entrySet()
//returns a sequential stream with this collection as its source
.stream()
//sorted according to the provided Comparator
.sorted(Map.Entry.comparingByKey())
//performs an action for each element of this stream
 .forEach(System.out::println);
 }
}
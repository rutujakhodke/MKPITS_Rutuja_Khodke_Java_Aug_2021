//6.Java Map example.comparingByValue().
import java.util.*;
public class TestMapEx6{
public static void main(String args[]){
Map<Integer,String> map=new HashMap<Integer,String>();
map.put(101,"Raj");
map.put(102,"Sumit");
map.put(103,"Harsh");
map.put(104,"Amit");
//returns a set view of the mappings contained in this map
map.entrySet()
//returns a sequential stream with this collection at its source
.stream()
//sorted according to the provided Comparator
.sorted(Map.Entry.comparingByValue())
//performs action on the each elements of this stream
.forEach(System.out::println);
 }
}
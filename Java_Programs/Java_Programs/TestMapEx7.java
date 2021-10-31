//7.Java Map example.comparingByValue() in Descending order.
import java.util.*;
public class TestMapEx7{
public static void main(String args[]){
Map<Integer,String> map=new HashMap<Integer,String>();
map.put(101,"Raj");
map.put(102,"Amit");
map.put(103,"Harsh");
//returns a set view of the mappings contained in this map
map.entrySet()
//returns a sequential stream with this collection at its source
.stream()
//sorted according to the provided Comparator
.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//performs action on the each element of this stream
.forEach(System.out::println);
 }
}
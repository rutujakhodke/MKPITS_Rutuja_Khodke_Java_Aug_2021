//5.Java Map example.comparingByKey() in Descending order.
import java.util.*;
public class TestMapEx5{
public static void main(String args[]){
Map<Integer,String> map=new HashMap<Integer,String>();
map.put(2010,"Silsiley");
map.put(2015,"Singham");
map.put(2002,"Lagaan");
//returns a set view of the mappings contained in this map
map.entrySet()
//returns a sequential stream with this collection at its source
.stream()
//sorted according to the provided Comparator
.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
//performs action on each element of this stream
.forEach(System.out::println);
 }
}
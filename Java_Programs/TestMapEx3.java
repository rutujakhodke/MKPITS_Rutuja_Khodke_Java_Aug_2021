//3.Java Map example.comparingByKey().
import java.util.*;
public class TestMapEx3{
public static void main(String args[]){
Map<Integer,String> map=new HashMap<Integer,String>();
map.put(2015,"Silsiley");
map.put(2000,"Aaina");
map.put(2005,"Narsimha");
//returns a set view of mappings contained in this map
map.entrySet()
//returns sequential stream with this collection at its source
.stream()
//sorted according to the provided Comparator
.sorted(Map.Entry.comparingByKey())
//performs action on each elements of this stream
.forEach(System.out::println);
 }
}


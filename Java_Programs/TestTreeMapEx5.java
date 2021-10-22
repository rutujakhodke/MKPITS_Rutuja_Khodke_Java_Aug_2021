//5.Java TreeMap example.SortedMap
import java.util.*;
public class TestTreeMapEx5{
 public static void main(String args[]){
 SortedMap<Integer,String> map=new TreeMap<Integer,String>();
 map.put(102,"Ajay");
 map.put(104,"Vijay");
 map.put(101,"Raj");
 map.put(103,"Harsh");
 //traversing the elements of map
  for(Map.Entry m:map.entrySet()){
   System.out.println(m.getKey()+" "+m.getValue());
  }
 //returns a key-value pairs whose keys are less than that the specified keys
 System.out.println("Head Map :"+map.headMap(103));

 //returns a key-value pairs whose keys are greater than or equal to the specified keys
 System.out.println("Tail Map :"+map.tailMap(102));

 //returns a key-value pairs exists between the specified keys
 System.out.println("Sub Map :"+map.subMap(102,104));
 }
}
//3.Java TreeMap example.NavigableMap
import java.util.*;
public class TestTreeMapEx3{
 public static void main(String args[]){
 NavigableMap<Integer,String> map=new TreeMap<Integer,String>();
 map.put(103,"Harsh");
 map.put(101,"Amit");
 map.put(104,"Vijay");
 map.put(102,"Raj");
 //maintains descending order
 System.out.println("Descending Map :"+map.descendingMap());

 //returns a key-value pairs whose keys are less than or equal to the specified key
 System.out.println("Head Map :"+map.headMap(102,true));

 //returns a key-value pairs whose keys are greater than or equal to the specified key
 System.out.println("Tail Map :"+map.tailMap(103,true));

 //returns a key-value pairs whose keys are exists in between the specified key
 System.out.println("Sub Map :"+map.subMap(101,false,103,true));
 }
}
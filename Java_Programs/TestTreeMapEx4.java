//4.Java TreeMap example.create a TreeMap collection to store year and album name.
import java.util.*;
public class TestTreeMapEx4{
 public static void main(String args[]){
 NavigableMap<Integer,String> map=new TreeMap<Integer,String>();
 map.put(2003,"Silsiley");
 map.put(2006,"Aaina");
 map.put(2001,"Narsimha");
 map.put(2004,"Dhruva");
 //maintains descending order
 System.out.println("Descending Map :"+map.descendingMap());

 //returns a key-value pairs whose keys are less than or equal to the specified keys
 System.out.println("Head Map :"+map.headMap(2006,false));

 //returns a key-value pairs whose keys are greater than or equal to the specified keys
 System.out.println("Tail Map :"+map.tailMap(2003,false));

 //returns a key-value pairs that are exists in between the specified keys
 System.out.println("Sub Map :"+map.subMap(2001,true,2004,false));
 }
}
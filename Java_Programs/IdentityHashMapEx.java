//1.Java Collection IdentityHashMap Example.
import java.util.Map;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.*;
public class IdentityHashMapEx{
 public static void main(String args[]){
 //creating an instance of IdentityHashMap
 Map<String,String> ihmap =new IdentityHashMap<String,String>();
 //putting the elements in the map
 //as key-value pair
 ihmap.put("Rashi","101023");
 ihmap.put("Sima","206735");
 ihmap.put(new String("Shravan"),"310385");
 ihmap.put("Nita","226451");
 ihmap.put("Anvi","962114");
 //declaring a set for entries
 Set set=ihmap.entrySet();
 //declaring an iterator
 Iterator itr=set.iterator();
 //displaying the elements
  while(itr.hasNext()){
   Map.Entry map=(Map.Entry)itr.next();
   System.out.println(map.getKey()+":");
   System.out.println(map.getValue());
  }
  System.out.println();
  //ihmap.size() compares the objects by reference
  //and prints the size of the IdentityHashMap
  System.out.println("Size of the IdentityHashMap is: "+ihmap.size());
 }
}
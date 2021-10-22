//2.Java TreeMap example.remove() method.
import java.util.*;
public class TestTreeMapEx2{
 public static void main(String args[]){
 TreeMap<Integer,String> map=new TreeMap<Integer,String>();
 map.put(103,"Harsh");
 map.put(101,"Jai");
 map.put(104,"Vijay");
 map.put(102,"Rahul");
 System.out.println("Before invoking remove() method :");
  for(Map.Entry m:map.entrySet()){
   System.out.println(m.getKey()+":"+m.getValue());
   }
 map.remove(103);
 System.out.println("After invoking remove() method :");
  for(Map.Entry m:map.entrySet()){
   System.out.println(m.getKey()+":"+m.getValue());
  }
 }
}

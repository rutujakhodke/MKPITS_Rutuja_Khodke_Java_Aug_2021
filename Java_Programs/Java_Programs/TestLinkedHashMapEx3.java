//3.Java LinkedHashMap example.remove() method.
import java.util.*;
public class TestLinkedHashMapEx3{
 public static void main(String args[]){
 LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
 map.put(111,"Raj");
 map.put(112,"Harsh");
 map.put(113,"Jai");
 for(Map.Entry m:map.entrySet()){
	System.out.println(m.getKey()+":"+m.getValue());
  }
 System.out.println("Before invoking remove() method :"+map);
 map.remove(113);
 System.out.println("After invoking remove() method :"+map);
 }
}
//2.Java LinkedHashMap example.Key-value pair.
import java.util.*;
public class TestLinkedHashMapEx2{
 public static void main(String args[]){
 LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
 map.put(101,"Amit");
 map.put(102,"Raj");
 map.put(103,"Harsh");
 map.put(104,"Anuj");
 //fetching keys
 System.out.println("Keys :"+map.keySet());

 //fetching values
 System.out.println("Values :"+map.values());

 //fetching key-value pairs
 System.out.println("Key-Value pairs :"+map.entrySet());
 }
}
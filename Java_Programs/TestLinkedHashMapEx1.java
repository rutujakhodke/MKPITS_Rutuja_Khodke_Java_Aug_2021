//1.Java LinkedHashMap example.
import java.util.*;
public class TestLinkedHashMapEx1{
 public static void main(String args[]){
 //creating LinkedHashMap and adding elements
 LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
 map.put(103,"Raj");
 map.put(102,"Amit");
 map.put(105,"Vijay");
 map.put(104,"Harsh");
 //traversing elements
 for(Map.Entry m:map.entrySet()){
  System.out.println(m.getKey()+":"+m.getValue());
  }
 }
}
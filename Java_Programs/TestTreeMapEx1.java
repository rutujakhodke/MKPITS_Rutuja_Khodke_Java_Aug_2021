//1.Java TreeMap example.
import java.util.*;
public class TestTreeMapEx1{
 public static void main(String args[]){
 //creating TreeMap and adding elements
 TreeMap<Integer,String> map=new TreeMap<Integer,String>();
 map.put(103,"Harsh");
 map.put(101,"Anuj");
 map.put(104,"Vijay");
 map.put(102,"Ajit");
 //traversing elements of map
 for(Map.Entry m:map.entrySet()){
 System.out.println(m.getKey()+":"+m.getValue());
  }
 }
}
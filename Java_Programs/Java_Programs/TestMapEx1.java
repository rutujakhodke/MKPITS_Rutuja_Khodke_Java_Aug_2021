//1.Java Map example.(Generic) new style.
import java.util.*;
public class TestMapEx1{
public static void main(String args[]){
//creating HashMap and adding key-value pair
Map<Integer,String> map=new HashMap<Integer,String>();
map.put(112,"Amit");
map.put(113,"Raj");
map.put(114,"Karan");
map.put(115,"Sumit");
//Elements can traverse in any order
//it cannot maintain insertion order
 for(Map.Entry m:map.entrySet()){
  System.out.println(m.getKey()+" "+m.getValue());
  }
 }
}
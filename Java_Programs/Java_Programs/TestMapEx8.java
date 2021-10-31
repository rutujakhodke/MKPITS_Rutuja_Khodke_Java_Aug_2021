//8.Java Map example.Create a HashMap collection to store year and album name.
import java.util.*;
public class TestMapEx8{
public static void main(String args[]){
//creating HashMap and adding elements in it
Map<Integer,String> map=new HashMap<Integer,String>();
map.put(1995,"Silsiley");
map.put(2000,"Aaina");
map.put(2005,"Narsimha");
//traverse the elements in any order
for(Map.Entry m:map.entrySet()){
 System.out.println(m.getKey()+" "+m.getValue());
  }
 }
}
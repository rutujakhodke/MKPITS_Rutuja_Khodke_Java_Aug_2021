//9.Java Map example.Create a HashMap collection of products(key-prodName and value-price) of 10 products.
import java.util.*;
public class TestMapEx9{
public static void main(String args[]){
Map<String,Integer> map=new HashMap<String,Integer>();
map.put("Laptop",36000);
map.put("AC",13000);
map.put("Mouse",200);
map.put("TV",20000);
map.put("Fridge",35000);
map.put("Mobile",10000);
map.put("Speaker",12000);
map.put("KeyBoard",5000);
map.put("HeadPhones",2000);
map.put("Watch",1000);
for(Map.Entry m:map.entrySet()){
 System.out.println(m.getKey()+" "+m.getValue());
  }
 }
}
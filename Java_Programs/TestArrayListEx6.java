//6.Java ArrayList Example.Get and set arrylist.
import java.util.*;
public class TestArrayListEx6{
  public static void main(String args[]){
  ArrayList<String> list=new ArrayList<String>();
  list.add("Ram");
  list.add("Akshay");
  list.add("Amit");
  System.out.println("Returning The element :"+list.get(1));
  list.set(1,"Anuj");
  for(String name:list)
  System.out.println("Student Names is :"+name);
  }
 }
//2.Java Collection AbstractSet example.Methods of AbstractSet.
import java.util.*;
public class AbstractSetEx2{
 public static void main(String args[]) throws Exception{
 try{
 AbstractSet<String> abSet = new TreeSet<String>();
 //adding objects of AbstractSet
 abSet.add("Welcome");
 abSet.add("to");
 abSet.add("Mkpits");
 abSet.add("Training");
 abSet.add("Centre");
 abSet.add("Java Training");

 //display the elements
 System.out.println("AbstractSet before"+" removeAll() operation: "+abSet);

 //creating another ArrayList
 Collection<String> list=new ArrayList<String>();
 //adding objects of arraylist
 list.add("Mkpits");
 list.add("Training");
 list.add("Centre");
 //displaying elements
 System.out.println("Collection Elements"+" to be removed: "+list);

 //removing elements from Abstractset which is specified in arrylist
 //using removeAll() method
 abSet.removeAll(list);
 //displaying the elements
 System.out.println("AbstractSet after"+" removeAll() operation: "+abSet);

}catch(NullPointerException e){
	System.out.println("Exception Thrown:"+e);
  }
 }
}

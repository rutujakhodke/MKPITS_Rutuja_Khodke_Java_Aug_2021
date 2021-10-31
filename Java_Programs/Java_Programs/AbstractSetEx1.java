//1.Java Collection AbstractSet example.
import java.util.*;
public class AbstractSetEx1{
 public static void main(String args[]) throws Exception{
 //creating object of AbstractSet class
  try{
 AbstractSet<Integer> abSet = new TreeSet<Integer>();
 //adding objects of AbstractSet
 abSet.add(1);
 abSet.add(2);
 abSet.add(3);
 abSet.add(4);
 abSet.add(5);
 //displaying the elements
 System.out.println("AbstractSet: "+abSet);
  }catch(Exception e){
	 System.out.println(e);
  }
 }
}

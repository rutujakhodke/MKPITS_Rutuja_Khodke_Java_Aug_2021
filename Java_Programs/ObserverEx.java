//1.Java Collection RandomAccess Interface Example.addObserver() method.
import java.util.*;
class ObserverEx{
 //driver method of the program
  public static void main(String args[]){
  ArrayList<String> list=new ArrayList<String>();
  list.add("Apple");
  list.add("Mango");
  list.add("Banana");
  for(int i=0,n=list.size();i<n;i++)
   System.out.println( list.get(i));
   
   //run faster than this loop
   //In the context of randomaccess interface the first loop using List.get() should be faster than other loops that use Iterator.next()
   //for a list to implement randomaccess.
   
   for(Iterator i=list.iterator();i.hasNext();)
    System.out.println(i.next());
  }
}
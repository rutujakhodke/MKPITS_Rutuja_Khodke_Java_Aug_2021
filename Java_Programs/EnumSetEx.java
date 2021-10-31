//1.Java Collection EnumSet example.
import java.util.*;
enum days {
     Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
}
public class EnumSetEx{
 public static void main(String args[]){
 //creating EnumSet
 Set<days> set=EnumSet.of(days.Thursday,days.Monday);
  //traversing the elements
  Iterator<days> itr=set.iterator();
   while(itr.hasNext()){
    System.out.println("Days in Collection are: "+itr.next());
   }
 }
}
//1.Java Collection EnumMap Example.Working of EnumMap and its functions.
import java.util.EnumMap;
public class EnumMapEx{
 public enum GFG{
  CODE,CONTRIBUTE,QUIZ,MCQ;
 }
  public static void main(String args[]){
  //Java EnumMap
  //Creating EnumMap in java with key
  //as enum type STATE
  EnumMap<GFG,String> gfgMap=new EnumMap<GFG,String>(GFG.class);

  //putting values inside EnumMap in java
  //inserting Enum keys different from their natural order
  gfgMap.put(GFG.CODE,"Start coding with gfg");
  gfgMap.put(GFG.CONTRIBUTE,"Contribute for others");
  gfgMap.put(GFG.QUIZ,"Practice Quizes");
  gfgMap.put(GFG.MCQ,"Test Speed with Mcqs");

  //printing size of EnumMap in java
  System.out.println("Size of EnumMap is: "+gfgMap.size());

  //printing EnumMap
  //print EnumMap in natural order of enum keys(order on which they are declared)
  System.out.println("EnumMap: "+gfgMap);

  //Retriving value from EnumMap
  System.out.println("key: "+GFG.CODE+"value:"+gfgMap.get(GFG.CODE));

  //checking if EnumMap contains a particular key
  System.out.println("Does gfgMap has "+GFG.CONTRIBUTE+":"+gfgMap.containsKey(GFG.CONTRIBUTE));

  //Checking if EnumMap contains a particular value
  System.out.println("Does gfgMap has:"+GFG.QUIZ+":"+gfgMap.containsValue("Practice Quizes"));
  System.out.println("Does gfgMap has:"+GFG.QUIZ+":"+gfgMap.containsValue(null));
 }
}
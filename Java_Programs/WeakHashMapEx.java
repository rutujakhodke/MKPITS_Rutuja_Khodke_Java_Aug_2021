//1.Java Collection WeakHashMap Example.
import java.util.*;
class WeakHashMapEx{
 public static void main(String args[]) throws Exception {
 WeakHashMap map=new WeakHashMap();
 Demo d=new Demo();
 
 //puts an entry into WeakHashMap
 map.put(d," Hi ");
 System.out.println(map);
 d=null;
 
 //garbage collector is called
 System.gc();
 //thread sleeps for 4 sec
 Thread.sleep(4000);
 
 System.out.println(map);
 }
}

class Demo{
 public String toString(){
  return "demo";
 }
 
 //finalize method
 public void finalize(){
  System.out.println("Finalize method is called");
 }
}

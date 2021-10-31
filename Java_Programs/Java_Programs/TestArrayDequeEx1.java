//1.Java ArrayDeque example.
import java.util.*;
public class TestArrayDequeEx1{
public static void main(String args[]){
//creating ArrayDeque and adding elements
Deque<String> deque=new ArrayDeque<String>();
 deque.add("Ravi");
 deque.add("Vijay");
 deque.add("Amit");
 deque.add("Ravi");
 //traverse the elements
 for(String str:deque){
  System.out.println(str);
  }
 }
}
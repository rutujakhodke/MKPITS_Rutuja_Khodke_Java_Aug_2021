//2.Java ArrayDeque example.offerFirst() and pollLast():
import java.util.*;
public class TestArrayDequeEx2{
public static void main(String args[]){
Deque<String> deque=new ArrayDeque<String>();
 deque.offer("Amit");//offer() method is used to add elements in deque
 deque.offer("Raj");
 deque.offer("Vijay");
 deque.add("Harsh");

 deque.offerFirst("Sumit");
 System.out.println("After offerFirst traversal..");
  for(String str:deque){
	System.out.println(str);
	  }

 deque.poll();
 System.out.println("After poll traversal :"+deque);

 deque.pollFirst();
 System.out.println("After pollFirst traversal :"+deque);//it is same as poll() method

 deque.pollLast();
 System.out.println("After pollLast traversal..");
 for(String str:deque){
  System.out.println(str);
  }
 }
}
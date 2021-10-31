//3.Java ArrayDeque example.offerFirst() and pollLast():
import java.util.*;
public class TestArrayDequeEx3{
public static void main(String args[]){
Deque<Integer> deque=new ArrayDeque<Integer>();
 deque.offer(23);
 deque.offer(67);
 deque.offer(3);
 deque.add(34);

 deque.offerFirst(45);
 System.out.println("After offerFirst traversal...");
  for(Integer ig:deque){
   System.out.println(ig);
 }
 deque.poll();
 System.out.println("After poll traversal ="+deque);

 deque.pollFirst();
 System.out.println("After pollFirst() method elements are ="+deque);

 deque.pollLast();
 System.out.println("After pollLast traversal..");
  for(Integer ig:deque){
   System.out.println(ig);
  }
 }
}
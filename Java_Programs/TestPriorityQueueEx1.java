//1.Java PriorityQueue example.
import java.util.*;
public class TestPriorityQueueEx1{
public static void main(String args[]){
PriorityQueue<String> queue=new PriorityQueue<String>();
queue.add("Amit");
queue.add("Vijay");
queue.add("Rahul");
queue.add("Harsh");
queue.add("Karan");
System.out.println("Head of the queue :"+queue.element());

System.out.println("Head of the queue :"+queue.peek());

System.out.println("Iterating the queue elements..");
 Iterator itr1=queue.iterator();
  while(itr1.hasNext()){
	System.out.println(itr1.next());
  }
 queue.remove();
 System.out.println("After invoking remove() method elements are ="+queue);

 queue.poll();
 System.out.println("After invoking poll() method elements are ="+queue);

 System.out.println("After removing two elements...");
  Iterator itr2=queue.iterator();
   while(itr2.hasNext()){
	System.out.println(itr2.next());
  }
 }
}
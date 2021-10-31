//3.Java Collection AbstractQueue example.Removal of elements from AbstractQueue.
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
public class AbstractQueueEx3{
 public static void main(String args[]) throws Exception {
 //AbstractQueue is an Abstract class
 //creating object using LinkedBlockingQueue
 AbstractQueue<Integer> abQ=new LinkedBlockingQueue<Integer>();
 //adding elements to the queue using add() method
 abQ.add(10);
 abQ.add(20);
 abQ.add(30);
 abQ.add(40);
 abQ.add(50);
 //displaying the queue contents to the console
 System.out.println("AbstractQueue contains: "+abQ);

 //Retrives the head
 int head=abQ.remove();
 //displaying the head element to the console
 System.out.println("Head element is: "+head);

 //displaying the modified queue
 System.out.println("After removal of head element AbstractQueue is: "+abQ);

 //remove all the elements
 abQ.clear();
 //displaying the modified queue
 System.out.println("AbstractQueue is: "+abQ);
 }
}

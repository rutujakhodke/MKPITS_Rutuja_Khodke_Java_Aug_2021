//4.Java Collection AbstractQueue example.Accessing elements from AbstractQueue.
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
public class AbstractQueueEx4{
 public static void main(String args[]) throws Exception {
 //since AbstractQueue is an Abstract class
 //creating object using LinkedBlockingQueue
 AbstractQueue<Integer> abQ=new LinkedBlockingQueue<Integer>();
 //adding elements to the queue using add() method
 abQ.add(10);
 abQ.add(20);
 abQ.add(30);
 abQ.add(40);
 abQ.add(50);
 //displaying the elements to the console
 System.out.println("AbstractQueue contains: "+abQ);
 
 //accessing the head element
 System.out.println("Head is: "+abQ.element());
 }
}

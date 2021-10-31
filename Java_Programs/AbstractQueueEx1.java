//1.Java Collection AbstractQueue example.
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
public class AbstractQueueEx1{
 public static void main(String args[]) throws Exception {
 //creating object of AbstractQueue
 AbstractQueue<Integer> abQ=new LinkedBlockingQueue<Integer>();
 //adding elements to the queue
 abQ.add(10);
 abQ.add(20);
 abQ.add(30);
 abQ.add(40);
 abQ.add(50);
 //displaying the elements of queue
 System.out.println("AbstractQueue contains: "+abQ);
 }
}
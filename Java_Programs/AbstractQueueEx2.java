//2.Java Collection AbstractQueue example.Adding elements into the AbstractQueue.
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
public class AbstractQueueEx2{
 public static void main(String args[]) throws Exception {
 //since AbstractQueue is an abstract class
 //creating object of abstractqueue using LinkedBlockingQueue
 AbstractQueue<Integer> abQ1 =new LinkedBlockingQueue<Integer>();
 //adding elements to the queue
 abQ1.add(10);
 abQ1.add(20);
 abQ1.add(30);
 abQ1.add(40);
 //displaying the abstractqueue elements
 System.out.println("AbstractQueue contains: "+abQ1);

 //since AbstractQueue is an Abstract class
 //creating another abstractQueue
 AbstractQueue<Integer> abQ2=new LinkedBlockingQueue<Integer>();
 //displaying the initially queue
 System.out.println("AbstractQueue initially contains: "+abQ2);

 //adding elements of abQ1 int abQ2 using addAll() method
 abQ2.addAll(abQ1);
 //displaying the elements to the queue
 System.out.println("After adding elements from abQ1 into abQ2 AbstractQueue contains: "+abQ2);
 }
}

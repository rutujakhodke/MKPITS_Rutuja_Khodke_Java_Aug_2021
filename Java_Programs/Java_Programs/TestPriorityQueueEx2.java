//2.Java PriorityQueue example.We are adding books to the queue and printing all the books.
import java.util.*;
class Book implements Comparable<Book>{
 int id;
 String name;
 String author;
 String publisher;
 int quantity;
 public Book(int id,String name,String author,String publisher,int quantity){
  this.id=id;
  this.name=name;
  this.author=author;
  this.publisher=publisher;
  this.quantity=quantity;
 }
 public int compareTo(Book b){
  if(id>b.id){
   return 1;
  }else if(id<b.id){
   return -1;
  }else{
   return 0;
  }
 }
}
public class TestPriorityQueueEx2{
public static void main(String args[]){
PriorityQueue<Book> queue=new PriorityQueue<Book>();
//creating Books
 Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",6);
 Book b2=new Book(233,"Data Communications and Networking","Forouzan","Mc Graw Hill",8);
 Book b3=new Book(101,"Operating System","Galvin","Willey",7);
 //adding books to the queue
 queue.add(b1);
 queue.add(b2);
 queue.add(b3);
 System.out.println("Books in the queue are...");
 System.out.println("*********************");
 //traversing elements
  for(Book b:queue){
  System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
  System.out.println("---------------");
  }
  queue.remove();
  System.out.println("After removing one record of Books..");
  //traversing elements
  for(Book b:queue){
   System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
   System.out.println("---------------");
  }
 }
}


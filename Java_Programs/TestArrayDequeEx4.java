//3.Java ArrayDeque example:Book
import java.util.*;
class Book{
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
}
public class TestArrayDequeEx4{
public static void main(String args[]){
Deque<Book> deque=new ArrayDeque<Book>();
//creating Books
 Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",6);
 Book b2=new Book(123,"Data Communications and Networking","Forouzan","Mc Graw Hill",8);
 Book b3=new Book(125,"Operating System","Galvin","Willey",7);
 //adding Books into deque
 deque.add(b1);
 deque.add(b2);
 deque.add(b3);
 System.out.println("Books ArrayDeque list are...");
 //traversing books
  for(Book b:deque){
  System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
  System.out.println("------------");
  }
 }
}

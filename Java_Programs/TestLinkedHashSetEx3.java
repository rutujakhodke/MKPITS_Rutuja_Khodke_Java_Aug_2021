//3.Java LinkedHashSet example:Book
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

public class TestLinkedHashSetEx3{
 public static void main(String args[]){
 LinkedHashSet<Book> hs=new LinkedHashSet<Book>();
 //creating Books
 Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",6);
 Book b2=new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",8);
 Book b3=new Book(103,"Operating System","Galvin","Willey",7);
 //adding books to hashtable
 hs.add(b1);
 hs.add(b2);
 hs.add(b3);
 //traverse the hashtable elements
 for(Book b:hs){
  System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
  }
 }
}

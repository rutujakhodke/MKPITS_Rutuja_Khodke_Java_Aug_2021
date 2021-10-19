//5.Java HashSet example.Book(We are adding books to set and printing all the books).
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

public class TestHashSetEx5{
 public static void main(String args[]){
 HashSet<Book> set=new HashSet<Book>();
 //creating Books
 Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",6);
 Book b2=new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",8);
 Book b3=new Book(103,"Operating System","Galvin","Willey",7);
 //adding books to HashSet
 set.add(b1);
 set.add(b2);
 set.add(b3);
 //traverse the set elements
 for(Book b:set){
  System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
  }
 }
}
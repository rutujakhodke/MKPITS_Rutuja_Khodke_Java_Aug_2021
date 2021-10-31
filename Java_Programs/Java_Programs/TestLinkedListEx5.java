//5.Java LinkedList Example:Book
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

public class TestLinkedListEx5{
 public static void main(String args[]){
 //creating list of Books
 Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",5);
 Book b2=new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",6);
 Book b3=new Book(103,"Operating System","Galvin","Wiley",7);
 //adding Books to list
 LinkedList<Book> list=new LinkedList<Book>();
 list.add(b1);
 list.add(b2);
 list.add(b3);
 //traverse the list of elements
 for(Book b:list)
 System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
 }
}
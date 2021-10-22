//4.Java LinkedHashMap example:Book
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
public class TestLinkedHashMapEx4{
 public static void main(String args[]){
 //creating map for Books
 LinkedHashMap<Integer,Book> map=new LinkedHashMap<Integer,Book>();
 //creating Books
 Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",6);
 Book b2=new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",8);
 Book b3=new Book(103,"Operating System","Galvin","Willey",7);
 //adding books to map
 map.put(3,b2);
 map.put(1,b1);
 map.put(2,b3);
 for(Map.Entry<Integer,Book> entry:map.entrySet()){
 int key=entry.getKey();
 Book b=entry.getValue();
 System.out.println(key+" Details: ");
 System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
  }
 }
}
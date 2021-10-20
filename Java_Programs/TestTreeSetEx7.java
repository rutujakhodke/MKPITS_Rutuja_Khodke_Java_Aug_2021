//7.Java TreeSet example.We are adding books to set and printing all the books.
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
public class TestTreeSetEx7{
 public static void main(String args[]){
 TreeSet<Book> set=new TreeSet<Book>();
 //creating Book class objects
 Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",6);
 Book b2=new Book(233,"Data Communications and Networking","Forouzan","Mc Graw Hill",8);
 Book b3=new Book(101,"Operating System","Galvin","Willey",7);
 //adding books to set
 set.add(b1);
 set.add(b2);
 set.add(b3);
 //traverse the elements
 for(Book b:set){
  System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
  }
 }
}

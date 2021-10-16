//13.Java ArrayList Example where we are adding books to list and printing all the books.
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

public class TestArrayListEx17{
 public static void main(String args[]){
 ArrayList<Book> list=new ArrayList<Book>();
 //creating Book class object
 Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
 Book b2=new Book(102,"Data communication and Networking","Forouzan","Mc Graw Hill",3);
 Book b3=new Book(103,"Operating System","Galvin","Wiley",5);
 //adding objects in a ArrayList
 list.add(b1);
 list.add(b2);
 list.add(b3);
 //traverse the ArrayList
 for(Book b:list)
 System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
 }
}
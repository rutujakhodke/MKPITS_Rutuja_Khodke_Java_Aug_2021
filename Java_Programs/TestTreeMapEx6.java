//6.Java TreeMap example:Book
import java.util.*;
class Book{
 int id;
 String name;
 String author;
 int quantity;
 float price;
 public Book(int id,String name,String author,int quantity,float price){
  this.id=id;
  this.name=name;
  this.author=author;
  this.quantity=quantity;
  this.price=price;
 }
}
public class TestTreeMapEx6{
 public static void main(String args[]){
 //creating map of Books
 Map<Integer,Book> map=new TreeMap<Integer,Book>();
 //creating Books
 Book b1=new Book(101,"Core Java","Johnson",6,560f);
 Book b2=new Book(102,"Python","Robert",8,450f);
 Book b3=new Book(103,"Oracle","Watson",5,670f);
 //adding books to map
 map.put(2,b2);
 map.put(1,b1);
 map.put(3,b3);
 
 //traversing elements
 for(Map.Entry<Integer,Book> entry:map.entrySet()){
  int key=entry.getKey();
  Book b=entry.getValue();
  System.out.println(key+" Details: ");
  System.out.println(b.id+" "+b.name+" "+b.author+" "+b.quantity+" "+b.price);
  }
 }
}
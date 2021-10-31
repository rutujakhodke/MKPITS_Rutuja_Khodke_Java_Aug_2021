//6.Java LinkedList Example:Book. Accepting values from the user.
import java.util.*;
class Book{
 int id;
 String name;
 int quantity;
 public Book(int id,String name,int quantity){
  this.id=id;
  this.name=name;
  this.quantity=quantity;
 }
}

public class TestLinkedListEx6{
 public static void main(String args[]){
 //creating list of books
 LinkedList<Book> list=new LinkedList<Book>();
 Book b[]=new Book[3];
 for(int i=0;i<3;i++){
 Scanner scan=new Scanner(System.in);
 System.out.println("Enter a Book Id :");
 int id=scan.nextInt();
 System.out.println("Enter a Book Name :");
 String name=scan.next();
 System.out.println("Enter a Book Quantity :");
 int quantity=scan.nextInt();
 b[i]=new Book(id,name,quantity);
 list.add(b[i]);//adding Books in a list
 }
//traverse an elements of a list
for(Book b1:list){
 System.out.println(b1.id+" "+b1.name+" "+b1.quantity);
  }
 }
}

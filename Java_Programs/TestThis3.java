//3.example of this keyword in class book with using constructor.
class Book{
String title;
float price;

public Book(String title,float price){
this.title=title;
this.price=price;
}
public void display(){
System.out.println("Title of a Book is ="+title);
System.out.println("Price of a Book is ="+price);
 }
}
class TestThis3{
public static void main(String args[]){
Book b1=new Book("Python",450.3f);
b1.display();
 }
}
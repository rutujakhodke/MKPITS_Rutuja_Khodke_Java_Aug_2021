//4.example of this keyword in class book with using method.
class Book{
String title;
String author;
float price;

 void insert(String title,String author,float price){
 this.title=title;
 this.author=author;
 this.price=price;
}
public void display(){
System.out.println(title+" "+author+" "+price);
 }
}
class TestThis4{
public static void main(String args[]){
Book b1=new Book();
Book b2=new Book();
b1.insert("Java","James Gosling",370.8f);
b2.insert("Python","Scott",450.7f);
b1.display();
b2.display();
 }
}
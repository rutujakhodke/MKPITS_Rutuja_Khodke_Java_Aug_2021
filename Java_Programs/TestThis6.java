//7.example of java to invoke current class method with this keyword.
class Book{
String title;
float price;

void insert(String title,float price){
 this.title=title;
 this.price=price;
 //this.display();//calling display method from insert method.
 display();
}
void display(){
System.out.println(title+" "+price);
 }
}
class TestThis6{
public static void main(String args[]){
Book b1=new Book();
b1.insert("Java",500f);
Book b2=new Book();
b2.insert("Oracle",450f);
 }
}
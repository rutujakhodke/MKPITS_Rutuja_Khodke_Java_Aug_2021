//9.example of java with this keyword (calling default constructor from parametrized constructor.)
class Book{
String title;//instance variable.
int price;

public Book(){//default constructor
 System.out.println("Constructor with no arguments are called.");
 title="Java";
 price=650;
 this.display();

}
public Book(String title,int price){//parametrized constructor.
 this();//used to invoke current class constructor
 System.out.println("Constructor with 2 parameters are invoked.");
 this.title=title;
 this.price=price;
}
void display(){
System.out.println(title+" "+price);
 }
}
class TestThisConstructorCall1{
public static void main(String args[]){
Book b1=new Book("Oracle",450);
b1.display();
 }
}
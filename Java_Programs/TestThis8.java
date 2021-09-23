//14.example of java calling a parameterized constructor from a default constructor by using this keyword.
class Book{
String title;
int price;
String company;

Book(){
this("HTML",390,"Mcmohan");
System.out.println("Hello from default constructor .");
}
Book(String title,int price,String company){
this.title=title;
this.price=price;
this.company=company;
}
void display(){
System.out.println(title+" "+price+" "+company);
 }
}
class TestThis8{
public static void main(String args[]){
Book b1=new Book();//it will call constructor with no arguments.
b1.display();
 }
}


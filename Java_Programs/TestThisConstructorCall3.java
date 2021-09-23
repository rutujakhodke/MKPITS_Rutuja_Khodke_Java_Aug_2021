//11.example of java with this keyword calling constructor with one parameter.
class Book{
String title;
int price;
String company;

Book(String company){//parametrized constructor with one parameter.
this.company=company;


}
Book(String title,int price,String company)//parametrized constructor with 3 parameter.
{
 this(company);//this keyword with variable name.
 System.out.println("Constructor with one parameter is invoked.");
 this.title=title;
 this.price=price;
}
void display(){
System.out.println(title+" "+price+" "+company);
 }
}
class TestThisConstructorCall3{
public static void main(String args[]){
Book b1=new Book("Python",340,"MacMohan");
b1.display();
 }
}
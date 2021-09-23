//10.example of java with this keyword(calling default constructor from parametrized constructor.)
class Product{
int prodId;
String prodName;
float price;

Product(){
 System.out.println("Default constructor is called.");
 prodId=134;
 prodName="TV";
 price=13000;
 this.display();
}

Product(int prodId,String prodName,float price){
this();
System.out.println("Parametrized constructor is called.");
this.prodId=prodId;
this.prodName=prodName;
this.price=price;

}
void display(){
System.out.println(prodId+" "+prodName+" "+price);
 }
}
class TestThisConstructorCall2{
public static void main(String args[]){
Product p1=new Product(189,"AC",30000);
p1.display();
Product p2=new Product(180,"Mouse",200);
p2.display();
 }
}
//12.example of java with this keyword calling constructor with one parameter.
class Product{
int prodId;
String prodName;
float price;

Product(String prodName){
this.prodName=prodName;
}
Product(int prodId,String prodName,float price){
this(prodName);
System.out.println("Constructor with one parameter is invoked.");
this.prodId=prodId;
this.price=price;
}
void display(){
System.out.println(prodId+" "+prodName+" "+price);
 }
}
class TestThisConstructorCall4{
public static void main(String args[]){
Product p1=new Product(134,"AC",20000f);
p1.display();
 }
}
//13.create a class Product having fields productId,productName,productPrice and getter and setter methods.(encapsulation)
class Product{
 private int prodId;
 private String prodName;
 private float prodPrice;

 public int getProdId(){
   return prodId;
 }
 public void setProdId(int prodId){
  this.prodId=prodId;
 }
 public String getProdName(){
  return prodName;
 }
 public void setProdName(String prodName){
  this.prodName=prodName;
 }
 public float getProdPrice(){
  return prodPrice;
 }
 public void setProdPrice(float prodPrice){
  this.prodPrice=prodPrice;
  }
}
class TestProductEncap{
public static void main(String[] args){
Product p1=new Product();
java.util.Scanner scan=new java.util.Scanner(System.in);
System.out.println("Enter a Product Id =");
int prodId=scan.nextInt();
System.out.println("Enter a Product Name =");
String prodName=scan.next();
System.out.println("Enter a Product Price =");
float prodPrice=scan.nextFloat();

p1.setProdId(prodId);
p1.setProdName(prodName);
p1.setProdPrice(prodPrice);

System.out.println(p1.getProdId()+" "+p1.getProdName()+" "+p1.getProdPrice());
 }
}













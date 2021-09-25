//14.create a class Orders having field orderId,orderDate,productname,price and quantity and getter and setter methods and calculatebill and display .
class Orders{
 private int orderId;
 private String orderDate;
 private String prodName;
 private float price;
 private int quantity;
 float totalBill;

 public int getOrderId(){
  return orderId;
 }
 public void setOrderId(int orderId){
  this.orderId=orderId;
 }
 public String getOrderDate(){
  return orderDate;
 }
 public void setOrderDate(String orderDate){
  this.orderDate=orderDate;
 }
 public String getProdName(){
  return prodName;
 }
 public void setProdName(String prodName){
  this.prodName=prodName;
 }
 public float getPrice(){
  return price;
 }
 public void setPrice(float price){
  this.price=price;
 }
 public int getQuantity(){
  return quantity;
 }
 public void setQuantity(int quantity){
  this.quantity=quantity;
 }
 public void calculateTotalBill(){
   totalBill=quantity*price;
   System.out.println("Total Bill Amount is :"+totalBill);
 }
}
class TestOrdersEncap{
public static void main(String[] args){
Orders o1=new Orders();
java.util.Scanner scan=new java.util.Scanner(System.in);
System.out.println("Enter a Order Id =");
int orderId=scan.nextInt();
System.out.println("Enter a Order Date =");
String orderDate=scan.next();
System.out.println("Enter a Product Name =");
String prodName=scan.next();
System.out.println("Enter a Price Of Product =");
float price=scan.nextFloat();
System.out.println("Enter a Quantity Product =");
int quantity=scan.nextInt();

o1.setOrderId(orderId);
o1.setOrderDate(orderDate);
o1.setProdName(prodName);
o1.setPrice(price);
o1.setQuantity(quantity);
System.out.println(o1.getOrderId()+" "+o1.getOrderDate()+" "+o1.getProdName()+" "+o1.getPrice()+" "+o1.getQuantity());
o1.calculateTotalBill();
 }
}
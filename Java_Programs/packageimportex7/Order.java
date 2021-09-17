//3.create a package mkpits2 and a class orders having field orderno,orderdate(string),customername,productname,price and quantity and methods
//insert,calculatetotalbillamount and display.
package mkpits2;
public class Order{
 long orderNo;
 String orderDate;
 String custName;
 String prodName;
 float price;
 int quantity;
 float totalBillAmount;
 
 public void insert(long on,String od,String cn,String pn,float p,int qn){
   orderNo=on;
   orderDate=od;
   custName=cn;
   prodName=pn;
   price=p;
   quantity=qn;
 }

 public void calculateTotalBillAmount(){
   totalBillAmount=quantity*price;
 }
 public void display(){
 System.out.println("Customer order number is ="+orderNo);
 System.out.println("Order date of product which orderd by customer ="+orderDate);
 System.out.println("Customer Name is ="+custName);
 System.out.println("Product Name is ="+prodName);
 System.out.println("Price of a product is ="+price);
 System.out.println("Enter a quantity of product ="+quantity);
 System.out.println("Total amount of a product is ="+totalBillAmount);
 }

}
//create a class TestOrder and accept orderno,orderdate,customername,productname,price and quantity and call the methods of order class.
import mkpits2.Order;
import java.util.*;
 class TestOrder{
 public static void main(String args[]){
 Order o1=new Order();
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a Order Number :");
 long orderNo=sc.nextInt();
 System.out.println("Enter a Order Date :");
 String orderDate=sc.next();
 System.out.println("Enter a Customer Name :");
 String custName=sc.next();
 System.out.println("Enter a Product Name :");
 String prodName=sc.next();
 System.out.println("Enter a price of product :");
 float price=sc.nextFloat();
 System.out.println("Enter a product Quantity :");
 int quantity=sc.nextInt();
 
 o1.insert(orderNo,orderDate,custName,prodName,price,quantity);
 o1.calculateTotalBillAmount();
 o1.display();
 }
}
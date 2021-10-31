//2.wap to accept customer name,product name,product price and quantity and then print customer name,product name,price quantity and total amount.
import java.util.*;
class Product
{
 public static void main(String args[])
 {
	 String customername,productname;
	 float productprice,totalamount;
	 int quantity;
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter a customer name :");
	 customername=s.next();
	 System.out.println("enter a product name :");
	 productname=s.next();
	 System.out.println("enter a product price :");
	 productprice=s.nextFloat();
	 System.out.println("enter a product quantity :");
	 quantity=s.nextInt();
	 totalamount=quantity * productprice;

	 System.out.println("customername :"+customername);
	 System.out.println("productname :"+productname);
	 System.out.println("productprice :"+productprice);
	 System.out.println("product quantity :"+quantity);
	 System.out.println("total amount is ="+totalamount);
 }
}
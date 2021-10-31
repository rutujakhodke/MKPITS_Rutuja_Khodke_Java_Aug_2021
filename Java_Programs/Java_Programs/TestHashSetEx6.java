//6.Java HashSet example.Product(We are adding Products to set and printing all the products).
import java.util.*;
class Product{
 int id;
 String pName;
 float price;
 int quantity;
 public Product(int id,String pName,float price,int quantity){
  this.id=id;
  this.pName=pName;
  this.price=price;
  this.quantity=quantity;
 }
}
public class TestHashSetEx6{
 public static void main(String args[]){
 HashSet<Product> set=new HashSet<Product>();
 //creating products
 Product p1=new Product(171,"SmartPhone",12000,5);
 Product p2=new Product(173,"Mouse",500,10);
 Product p3=new Product(174,"AC",25000,4);
 //adding products in set
 set.add(p1);
 set.add(p2);
 set.add(p3);
 System.out.println("------------Products set are--------");
 //traversing elements of products
 for(Product p:set){
  System.out.println(p.id+" "+p.pName+" "+p.price+" "+p.quantity);
  System.out.println("---------------");
  }
 }
}
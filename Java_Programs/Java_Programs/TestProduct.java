//7.create a class product and create 2 objects.
class Product
{
 int productId;
 String productName;
 double productPrice;

}
class TestProduct
{
 public static void main(String args[])
 {
  Product p1=new Product();//creating object or instance
  Product p2=new Product();

  p1.productId=112;
  p1.productName="Mouse";
  p1.productPrice=120;

  p2.productId=113;
  p2.productName="Keyboard";
  p2.productPrice=200.0;

  System.out.println("product id is :"+p1.productId);
  System.out.println("product name is :"+p1.productName);
  System.out.println("product price is :"+p1.productPrice);

  System.out.println("     ");

  System.out.println("product id is :"+p2.productId);
    System.out.println("product name is :"+p2.productName);
  System.out.println("product price is :"+p2.productPrice);

 }
}
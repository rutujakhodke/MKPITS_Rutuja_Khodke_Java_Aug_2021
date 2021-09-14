//8.create a class product and initialize it with method.
class Product
{
 int productId;
 String productName;
 double productPrice;//field or data member or instance variable
 //creating method to insert product.
 public void insertProduct(int pid,String pn,double pr)
 {
  productId=pid;
  productName=pn;
  productPrice=pr;

 }
 public void displayProduct()
 {
  System.out.println("Product Id is :"+productId);
  System.out.println("Product name is :"+productName);
  System.out.println("Product price ="+productPrice);

 }
}
class TestProduct1
{
 public static void main(String args[])
 {
	 Product p1=new Product();//creating an object of Product.
	 p1.insertProduct(12,"Monitor",20000.0f);
	 p1.displayProduct();

	 System.out.println("   ");

	 Product p2=new Product();//creating second object or instance.
	 p2.insertProduct(13,"AC",40000);
	 p2.displayProduct();
 }
}
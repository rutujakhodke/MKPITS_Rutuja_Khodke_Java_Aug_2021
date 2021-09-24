//12.create a class Customer having field customerid,customername,customeremail,customermobile,and setter and getter methods.
class Customer{
 private int custId;
 private String custName;
 private String custEmail;
 private long custMobNo;

 public int getCustId(){
 return custId;
 }
 public void setCustId(int custId){
	this.custId=custId;
 }
 public String getCustName(){
	return custName;
 }
 public void setCustName(String custName){
	this.custName=custName;
 }
 public String getCustEmail(){
	return custEmail;
 }
 public void setCustEmail(String custEmail){
	this.custEmail=custEmail;
 }
 public long getCustMobNo(){
	return custMobNo;
 }
 public void setCustMobNo(long custMobNo){
	 this.custMobNo=custMobNo;
 }
}
class TestCustomerEncap{
public static void main(String[] args){
Customer c1=new Customer();
java.util.Scanner s=new java.util.Scanner(System.in);
System.out.println("Enter a Customer Id =");
int custId=s.nextInt();
System.out.println("Enter a Customer Name =");
String custName=s.next();
System.out.println("Enter a Customer Email =");
String custEmail=s.next();
System.out.println("Enter a Customer Mobile Number =");
long custMobNo=s.nextLong();

c1.setCustId(custId);
c1.setCustName(custName);
c1.setCustEmail(custEmail);
c1.setCustMobNo(custMobNo);

System.out.println(c1.getCustId()+"  "+c1.getCustName()+"  "+c1.getCustEmail()+"  "+c1.getCustMobNo());
 }
}
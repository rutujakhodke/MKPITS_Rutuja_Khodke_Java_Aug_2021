//11.create a class customer having custid,custname,custaddress,mobno,email.
class Customer
{
 int custId;
 String custName;
 String custAddress;
 long mobNo;
 String emailId;


public void insertCustomerDetails(int cid,String name,String add,long mobno,String email)
{
 custId=cid;
 custName=name;
 custAddress=add;
 mobNo=mobno;
 emailId=email;
}
public void displayCustomerDetails()
{
 System.out.println("Customer Id is :"+custId);
 System.out.println("Customer name is :"+custName);
 System.out.println("Customer address is :"+custAddress);
 System.out.println("Customer mobile no. is :"+mobNo);
 System.out.println("Customer email is :"+emailId);
}
}
class TestCustomer
{
 public static void main(String args[])
 {
  Customer c1=new Customer();
  c1.insertCustomerDetails(112,"Ram","Mahal_Nagpur",8967095643L,"abc@gmail.com");
  c1.displayCustomerDetails();
 }
}
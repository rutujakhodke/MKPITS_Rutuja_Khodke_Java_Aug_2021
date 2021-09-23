//10.create a class Account of encapsulated type of having 4 fields only with its setter and getter methods.
class Account{
private long acc_no;
private String name;
private String email;
private float amount;

public void setAcc_no(long acc_no){
 this.acc_no=acc_no;
}
public long getAcc_no(){
 return acc_no;
}

public void setName(String name){
 this.name=name;
 }
public String getName(){
 return name;
}

public void setEmail(String email){
 this.email=email;
}
public String getEmail(){
  return email;
}

public void setAmount(float amount){
 this.amount=amount;
}
public float getAmount(){
 return amount;
 }
}
class TestAccount2{
public static void main(String args[]){
Account a1=new Account();
a1.setAcc_no(7290654);
a1.setName("Amit Kumar");
a1.setEmail("amit67@gmail.com");
a1.setAmount(10000);
System.out.println(a1.getAcc_no()+"  "+a1.getName()+"  "+a1.getEmail()+"  "+a1.getAmount());
 }
}
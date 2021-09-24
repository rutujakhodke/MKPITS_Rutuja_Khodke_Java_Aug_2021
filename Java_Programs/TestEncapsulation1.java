//11.create a class User having fields username and password and setter and getter methods and checklogin and signup methods.
class User{
 private String userName;
 private String password;

 public String getUserName(){
  return userName;
 }
 public void setUserName(String userName){
  this.userName=userName;
 }
 public String getPassword(){
  return password;
 }
 public void setPassword(String password){
  this.password=password;
 }
 public String checkLogin(String userName,String password){
  if(userName.equals("admin")&& password.equals("admin")){
   return "Login Successful for User "+userName;
  }
  else{
   return "Invalid credentials,try again!";
  }
}
  //method to save user credentials
  public String signup(String userName,String password){
  setUserName(userName);
  setPassword(password);
  return "User Details saved Successfully";
  }
 public void display(){
 }
}
class TestEncapsulation1{
public static void main(String args[]){
User u1=new User();
java.util.Scanner scan=new java.util.Scanner(System.in);
System.out.println("1-Process to create Your Account(signUp)");
System.out.println("Enter a User Name :");
String un=scan.next();
System.out.println("Enter a Password :");
String pwd=scan.next();
String result=u1.signup(un,pwd);
System.out.println(result);
System.out.println("----------------------");
System.out.println("1-Process to SignIn(Login)");
System.out.println("Enter a User Name :");
un=scan.next();
System.out.println("Enter a Password :");
pwd=scan.next();
result=u1.checkLogin(un,pwd);
System.out.println(result);
 }
}
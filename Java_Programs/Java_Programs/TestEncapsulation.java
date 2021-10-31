//10.create a class User of encapsulated type having 2 private fields and public methods.
class User{
 private String userName;//private data members
 private String password;

 //public getter and setter methods
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
 //create method to check credentials
 public String checkLogin(String userName,String password){
  if(userName.equals("admin")&& password.equals("admin")){
   return "Login Successful for User " +userName;
   }
  else{
    return "Invalid Credentials,try again!";
   }
 }
}
class TestEncapsulation{
public static void main(String args[]){
User u1=new User();
java.util.Scanner scan=new java.util.Scanner(System.in);
System.out.println("Enter a username:");
String un=scan.next();
System.out.println("Enter a password :");
String pwd=scan.next();
u1.setUserName(un);
u1.setPassword(pwd);
String result=u1.checkLogin(u1.getUserName(),u1.getPassword());
System.out.println(result);
 }
}
//1.Example of Java Throws Keyword in Exception Handling.
class Saving{
 String deposit(int amount) throws Exception {
  return "Amount deposited";
 }
}
public class TestThrowsEx{
 public static void main(String args[]){
  Saving s=new Saving();
  try{
  String str=s.deposit(500);
  System.out.println(str);
}catch(Exception ee){
	System.out.println(ee.toString());
}
 }
}
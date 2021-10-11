//2.Example of Java Throws Keyword in Exception Handling.
class Calculation{
 int divide(int n1,int n2) throws Exception{
     int res=n1/n2;
     return res;
 }
}
public class TestThrowsEx1{
 public static void main(String args[]){
 Calculation c=new Calculation();
   try{
      int result=c.divide(10,0);
      System.out.println("Result is ="+result);
  }catch(Exception e){
    System.out.println(e.toString());
  }
 System.out.println("Program reached till the end..");
   }
 }


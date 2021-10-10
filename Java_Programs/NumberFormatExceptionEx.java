//8.Java Exception Handling Example.consider a example where an NumberFormatException occurs.
public class NumberFormatExceptionEx{
 public static void main(String args[]){
   try{
      String s="xyz";
      int i=Integer.parseInt(s);//NumberFormat Exception occurs
  }catch(Exception ee){
    System.out.println(ee.toString());
  }
  finally{
    System.out.println("Finally block is executed.");
  }
  System.out.println("Rest of the code is executed..");
 }
}

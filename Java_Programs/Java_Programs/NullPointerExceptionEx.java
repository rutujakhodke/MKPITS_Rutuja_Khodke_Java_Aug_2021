//7.Java Exception Handling Example.consider a example where an NullPointerException occurs.
public class NullPointerExceptionEx{
 public static void main(String args[]){
   try{
       String s=null;//NullPointer Exception occurs
       System.out.println(s.length());
  }catch(Exception ee){
    System.out.println(ee.toString());
  }
  finally{
    System.out.println("Finally block is executed");
  }
   System.out.println("Rest of the code is executed");
   System.out.println("Bye");
 }
}

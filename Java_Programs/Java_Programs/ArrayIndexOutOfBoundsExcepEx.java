//9.Java Exception Handling Example.consider a example where an ArrayIndexOutOfBoundsException occurs.
class ArrayIndexOutOfBoundsExcepEx{
 public static void main(String args[]){
   try{
      int num[]=new int[4];
       num[5]=23;
  }catch(Exception ee){
    System.out.println(ee.toString());
  }
  finally{
   System.out.println("Finally block is executed");
  }
  System.out.println("Rest of the code is executed");
 }
}

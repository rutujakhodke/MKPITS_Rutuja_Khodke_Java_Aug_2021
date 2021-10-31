//3.Example of Java Exception Handling.use try,catch and Finally keyword.
class ExceptionHandleEx1{
 public static void main(String args[]){
   int n1=10;
   int n2=2;
   int result=0;
   try{
      result=n1/n2;
  }catch(Exception e){
     System.out.println(e.toString());
  }
  finally{
    System.out.println("Finally Result is ="+result);
  }
 }
}
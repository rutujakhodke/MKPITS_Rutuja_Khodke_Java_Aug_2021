//4.Example of Java Exception Handling.use try,catch and Finally keyword.
class ExceptionHandleEx2{
 public static void main(String args[]){
  int arr[]=new int[5];
  int res=0;
  try{
    arr[6]=32;
 }catch(Exception e){
   System.out.println(e.toString());
 }
 finally{
  System.out.println(res);
 }
 System.out.println("Bye from Exception..");
 }
}
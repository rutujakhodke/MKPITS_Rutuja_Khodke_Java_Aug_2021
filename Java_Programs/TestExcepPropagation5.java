//5.Program of Exception Propagation.Program which describes that checked exceptions are not propagated.
class Sample{
 void m(){
  throw new java.io.IOException("Device error");//checked exception
 }
 void n(){
  m();
 }
 void p(){
   try{
     n();
 }catch(Exception ee){
   System.out.println("Exception Handled in p() method");
 }
  }
}
public class TestExcepPropagation5{
  public static void main(String args[]){
  Sample s=new Sample();
  s.p();//compile time error
 }
}

//6.Program of Exception Propagation.Program which describes that checked exceptions are not propagated.
class Sample{
 void m(){
    try{
  throw new java.io.IOException("Device error");
 }catch(Exception ee){
   System.out.println(ee);
 }
}
 void n(){
  m();
 }
 void p(){
  try{
    n();
 }catch(Exception ee){
   System.out.println("Exception handled");
 }
}
}
public class TestExcepPropagation6{
  public static void main(String args[]){
  Sample s=new Sample();
  s.p();
 }
}


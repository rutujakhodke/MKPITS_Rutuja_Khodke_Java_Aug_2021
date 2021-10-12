//4.Program of Exception Propagation.
class Sample{
 void m(){
    try{
       int data=20/0;
  }catch(Exception ee){
    System.out.println("Exception is handled in m() method");
  }
 }
 void n(){
   m();
 }
 void p(){
   n();
 }
}
public class TestExcepPropagation4{
  public static void main(String args[]){
  Sample s=new Sample();
   try{
  s.p();
 }catch(Exception ee){
	 System.out.println("Exception handled");
 }
 System.out.println("Program reached till the end");
 }
}
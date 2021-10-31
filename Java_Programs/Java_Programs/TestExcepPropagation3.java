//3.Program of Exception Propagation.
class Sample{
 void m(){
   int data=50/0;
 }
 void n(){
   m();
 }
 void p(){
  n();
 }
}
public class TestExcepPropagation3{
 public static void main(String args[]){//exception is handled in main() method.
 Sample s=new Sample();
    try{
        s.p();
  }catch(Exception ee){
     System.out.println("Exception is Handled in main method()");
  }
 System.out.println("Program reached till the end..");
 }
}

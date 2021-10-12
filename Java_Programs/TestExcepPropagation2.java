//2.Program of Exception Propagation.
class Sample{
 void m(){
    int data=30/0;
 }
 void n(){
  m();//calling m method
 }
 void p(){//exception is handled in p() method.
     try{
        n();
  }catch(Exception ee){
     System.out.println("Exception handled");
  }
 }
}
public class TestExcepPropagation2{
 public static void main(String args[]){
 Sample s=new Sample();
 s.p();
 System.out.println("Program reached till the end");
 }
}
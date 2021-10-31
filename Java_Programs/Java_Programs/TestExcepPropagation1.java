//1.Program of Exception Propagation.
class Calculation1{
  int divide(int n1,int n2){
     int res=n1/n2;
     return res;
  }
}
class Calculation2 extends Calculation1{
 int caldivide(int n1,int n2){
     int res=0;
     try{
         res=divide(n1,n2);
         return res;
   }catch(Exception ee){
     System.out.println(ee.toString());
   }
    return res;
 }
}
public class TestExcepPropagation1{
 public static void main(String args[]){
  Calculation2 c=new Calculation2();
  int result=c.caldivide(10,0);//Arithmetic exception occurs
  System.out.println(result);
  System.out.println("Program reached till the end..");
 }
}
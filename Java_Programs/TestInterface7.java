//7.Java Interface Example:Bank,which provides the implementation of Bank interface.
interface Bank{
 float rateOfInterest();
}
class SBI implements Bank{
 public float rateOfInterest(){
  return 9.15f;
 }
}
class PNB implements Bank{
 public float rateOfInterest(){
  return 7.5f;
 }
}
class TestInterface7{
  public static void main(String args[]){
  Bank b=null;
  b=new SBI();
  System.out.println("Rate of Interest of SBI ="+b.rateOfInterest()+"%");
  b=new PNB();
  System.out.println("Rate of Interest of PNB ="+b.rateOfInterest()+"%");
 }
}

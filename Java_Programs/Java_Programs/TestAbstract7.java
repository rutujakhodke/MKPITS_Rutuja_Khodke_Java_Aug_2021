//7.Example of abstract class in java.create a class bank,SBI,PNB.
abstract class Bank{
 abstract int getRateOfInterest();
}
class SBI extends Bank{
 int getRateOfInterest(){
  return 7;
 }
}
class PNB extends Bank{
 int getRateOfInterest(){
  return 8;
 }
}
class AXIS extends Bank{
 int getRateOfInterest(){
  return 9;
 }
}
class TestAbstract7{
public static void main(String args[]){
Bank b;
b=new SBI();
 System.out.println("Rate of Interest of SBI is :"+b.getRateOfInterest()+"%");
b=new AXIS();
 System.out.println("Rate of Interest of AXIS is :"+b.getRateOfInterest()+"%");
b=new PNB();
 System.out.println("Rate Of Interest of PNB is :"+b.getRateOfInterest()+"%");
 }
}
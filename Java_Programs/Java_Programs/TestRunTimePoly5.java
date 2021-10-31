//5.Example of runtime polymorphism.where Bank is a class that provides a method to get the rate of interest. However, the rate of interest may differ according to banks.
// For example, SBI, ICICI, and AXIS banks are providing 8.4%, 7.3%, and 9.7% rate of interest.
class Bank{
 float getRateOfInterest(){
  return 0;
 }
}
class SBI extends Bank{
 float getRateOfInterest(){
  return 8.4f;
 }
}
class ICICI extends Bank{
 float getRateOfInterest(){
  return 7.3f;
 }
}
class AXIS extends Bank{
 float getRateOfInterest(){
  return 9.7f;
 }
}
class TestRunTimePoly5{
public static void main(String args[]){
Bank b;//b is a reference variable of Bank class
b=new SBI();
System.out.println("SBI Rate of Interest is ="+b.getRateOfInterest());//8.4f

b=new ICICI();
System.out.println("ICICI Rate of Interest is ="+b.getRateOfInterest());//7.3f

b=new AXIS();
System.out.println("AXIS Rate of Interest is ="+b.getRateOfInterest());//9.7f
 }
}
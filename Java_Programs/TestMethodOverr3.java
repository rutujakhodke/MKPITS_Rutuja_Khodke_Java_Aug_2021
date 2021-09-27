//5.Java program to demonstrate the real scenario of java method overriding(example of bank),where three classes are overriding the method of parent class.
class Bank{
 int getRateOfInterest(){//method with no parameter and return type.
  return 0;
 }
}
class SBI extends Bank{
 int getRateOfInterest(){
  return 8;
 }
}
class ICICI extends Bank{
 int getRateOfInterest(){
  return 7;
 }
}
class AXIS extends Bank{
 int getRateOfInterest(){
  return 9;
 }
}
class TestMethodOverr3{
public static void main(String args[]){
 SBI s=new SBI();
 ICICI i=new ICICI();
 AXIS a=new AXIS();

 System.out.println("SBI Rate of interest is ="+s.getRateOfInterest());
 System.out.println("ICICI Rate of interest is ="+i.getRateOfInterest());
 System.out.println("AXIS Rate of interest is ="+a.getRateOfInterest());
 }
}


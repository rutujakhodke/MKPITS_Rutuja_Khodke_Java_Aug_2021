//2.example of runtime polymorphism.create a class bank and then create a child class of bank(SBI,AXIS,ICICI).we have to create a reference variable of parent class ,to access the child class object.
class Bank{
 int getRateOfInterest(){
  return 0;
 }
}
class SBI extends Bank{
 int getRateOfInterest(){
  return 7;
 }
}
class ICICI extends Bank{
 int getRateOfInterest(){
  return 8;
 }
}
class AXIS extends Bank{
 int getRateOfInterest(){
  return 9;
 }
}
class TestRunTimePoly2{
public static void main(String args[]){
java.util.Scanner s=new java.util.Scanner(System.in);
System.out.println("Enter a Bank Name :");
String bn=s.next();
Bank b=null;//b is a reference variable of parent class (Bank).
 if(bn.equals("SBI")){
  b=new SBI();
}
 else if(bn.equals("ICICI")){
  b=new ICICI();
}
 else if(bn.equals("AXIS")){
  b=new AXIS();
}

  System.out.println("Rate of Interest is :"+b.getRateOfInterest());
 }
}
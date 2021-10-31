//8.example of method overriding.
class Bank{
 static int roi=2;

 int getRateOfInterest(){
  return 0;
 }
 static void showRoi(){
  System.out.println("Roi from static method :"+roi);
 }
}
class SBI extends Bank{
 int getRateOfInterest(){
  roi=roi+2;
  return roi;
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
class TestMethodOverr7{
public static void main(String args[]){

SBI s=new SBI();
Bank.showRoi();
ICICI i=new ICICI();
AXIS a=new AXIS();

System.out.println("SBI Rate of Interest :"+s.getRateOfInterest());//4
System.out.println("ICICI Rate of Interest :"+i.getRateOfInterest());//7
System.out.println("AXIS Rate of Interest :"+a.getRateOfInterest());//9
 }
}
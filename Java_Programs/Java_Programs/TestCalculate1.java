//9.create a class Calculate of private data member and having getter and setter methods.
class Calculate{
 private float roi;//roi-rate of interest.
 //setter method for roi.
 public void setRoi(float roi){
  this.roi=roi;
 }
 public float calInterest(float pa,int nom){
  float pi=pa*roi*nom;//pi-personal interest,nom-no. of month,pa=principal amount
  return pi;
 }
}
class TestCalculate1{
public static void main(String args[]){
Calculate c1=new Calculate();
c1.setRoi(30);
//System.out.println("roi ="+c1.getRoi());//compile time error
float ta=c1.calInterest(1000,12);//ta-total amount.
System.out.println("Total amount with interest "+ta);
 }
}
//9.Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with separate methods for each operation whose
//real and imaginary parts are entered by user.
//In this program we have a class ComplexNumber .In this class we have two instance variables real and imaginary parts of complex number.
//we have declared a method sum() to add two numbers by adding their real and imaginary parts together
//The constuctor of this class is used for initalizing the complex number.For eg:when we create a constructor of this class like this
//ComplexNumber temp=new ComplexNumber(0,0);
class ComplexNumber{
 //for real and imaginary parts of complex number
 double real,img;
 //constructor to initalize the complex number
 public ComplexNumber(double r,double i){
  this.real=r;
  this.img=i;
 }

 public static ComplexNumber sum(ComplexNumber c1,ComplexNumber c2){
 //creating a temporary complex number to hold the sum of 2 numbers
   ComplexNumber temp=new ComplexNumber(0,0);
    temp.real=c1.real+c2.real;
    temp.img=c1.img+c2.img;
    //returning the output complex number
     return temp;
 }

  public static ComplexNumber difference(ComplexNumber c1,ComplexNumber c2){
	 ComplexNumber temp1=new ComplexNumber(0,0);
	 temp1.real=c1.real-c2.real;
	 temp1.img=c1.img-c2.img;
	  return temp1;
 }

  public static ComplexNumber product(ComplexNumber c1,ComplexNumber c2){
	 ComplexNumber temp2=new ComplexNumber(0,0);
	 temp2.real=c1.real*c2.real;
	 temp2.img=c1.img*c2.img;
	  return temp2;
 }

    public static void main(String args[]){
    ComplexNumber c1=new ComplexNumber(5.5,4);
    ComplexNumber c2=new ComplexNumber(1.2,3.5);
    ComplexNumber temp=sum(c1,c2);
    System.out.println("Sum is :"+ temp.real+ " + "+ temp.img + "i");
    ComplexNumber temp1=difference(c1,c2);
    System.out.println("Difference is :"+ temp1.real+ " - "+ temp1.img + "i");
    ComplexNumber temp2=product(c1,c2);
    System.out.println("Product is :"+ temp2.real+ " * "+ temp2.img + "i");
 }
}
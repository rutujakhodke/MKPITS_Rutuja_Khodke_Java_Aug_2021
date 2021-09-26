//12.(function with return value and no parameters).wap to create a method factorial ,calculate factorial and return the factorial.
class Factorial{

public int factorial(){
 int fact=1;
  int num;
 java.util.Scanner scan=new java.util.Scanner(System.in);
 System.out.println("Enter a Number :");
  num=scan.nextInt();

  while(num>0){
   fact=fact*num;
   num--;
  }
  return fact;
}
}
class TestFactMethod{
public static void main(String args[]){
Factorial f=new Factorial();
int fact=f.factorial();
System.out.println("Factorial of a number is ="+fact);
 }
}
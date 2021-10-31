//2.(function with no parameter and returning nothing (void)).wap to create a method sum to accept a 2 no. and display the addition of 2 no.
import java.util.*;
class Function2{
   int n1,n2;
     int res;
   public  void sum(){
	   Scanner s=new Scanner(System.in);
     System.out.println("Enter a number :");
	   	 int n1=s.nextInt();
	   	System.out.println("Enter a second number :");
  	int n2=s.nextInt();
   int  res=n1+n2;
   System.out.println("Addition of 2 number is :"+res);

     }
 }//when calling method sum in another class,we have to create a object.
 //and when method is static and we have to call method in same class,then we have to call method with method name only.
 class TestFunction2
 {
  public static void main(String args[]){
  Function2 f1=new Function2();
  	f1.sum();
 }
}


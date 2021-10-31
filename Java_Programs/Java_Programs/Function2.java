//2.(function with no parameter and returning nothing (void)).wap to create a method sum to accept a 2 no. and display the addition of 2 no.
import java.util.*;
class Function2{
   int n1,n2;
     int res;
   public static void sum(){
	   Scanner s=new Scanner(System.in);
     System.out.println("Enter a number :");
	   	 int n1=s.nextInt();
	   	System.out.println("Enter a second number :");
  	int n2=s.nextInt();
   int  res=n1+n2;
   System.out.println("Addition of 2 number is :"+res);

     }
 }
 class TestFunction2
 {

  public static void main(String args[]){

  	sum();
    //int res=0;

  	//res=n1+n2;

  	//System.out.println("Addition of 2 number is :"+res);

   // System.out.println("Addition of 2 number is :"+res);
	  }
	}


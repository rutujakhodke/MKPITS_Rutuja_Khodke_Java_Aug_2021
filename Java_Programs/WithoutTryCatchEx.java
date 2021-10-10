//10.Example of Exception Handling.In this example to understand the problem we don't use a try-catch block.
public class WithoutTryCatchEx{
 public static void main(String args[]){
   int data=20/0;//may throw excption(run time error will occur)
   System.out.println("Rest of the code will be executed..");
 }
}
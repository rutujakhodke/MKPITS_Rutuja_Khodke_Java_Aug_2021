//6.Java program to Clone the Array.
public class TestCloneArrayEx{
 public static void main(String args[]){
 int arr[]={33,34,8,9,7};
 System.out.println("Printing original array:");
  for(int i:arr)
  System.out.println(i);

  System.out.println("Printing clone of the array:");
  int carr[]=arr.clone();
  for(int i:carr)
  System.out.println(i);

  System.out.println("Are both equal?");
  System.out.println(arr==carr);
 }
}
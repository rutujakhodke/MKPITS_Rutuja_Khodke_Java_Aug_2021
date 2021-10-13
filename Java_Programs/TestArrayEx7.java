//7.Java program to demonstrate the way of passing an array to a method.
public class TestArrayEx7{
 //creating a method which receives array as an parameter
 static void min(int arr[]){
  int min=arr[0];
  for(int i=1;i<arr.length;i++)
   if(min>arr[i])
    min=arr[i];

   System.out.println("Minimum value is ="+min);
 }
 public static void main(String args[]){
  int[] a={33,3,4,5};//declaration and initalizing of array
  min(a);//passing array to a method min()
 }
}
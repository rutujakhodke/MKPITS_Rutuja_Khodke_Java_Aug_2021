//8.Java program of Anonymous Array,so you don't need to declare the array while passing an array to the method.
public class TestArrayEx8{
  //creating a method which receives array as an parameter
  static void min(int arr[]){
   int min=arr[0];
   for(int i=1;i<arr.length;i++)
    if(min>arr[i])
     min=arr[i];
   System.out.println("Minimum value ="+min);
  }
  public static void main(String args[]){
   min(new int[] {1,5,3,4,7});//passing array to the method (Anonymous array)
  }
}
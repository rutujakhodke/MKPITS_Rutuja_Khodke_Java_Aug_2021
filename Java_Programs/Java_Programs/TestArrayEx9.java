//9.Java program to demonstrate the way of passing an anonymous array to method.
public class TestArrayEx9{
 static void printArray(int arr[]){
  for(int i=0;i<arr.length;i++)
  System.out.println(arr[i]);
 }
  public static void main(String args[]){
  printArray(new int[] {10,20,30,40,50});//passing anonymous array to a method
 }
}
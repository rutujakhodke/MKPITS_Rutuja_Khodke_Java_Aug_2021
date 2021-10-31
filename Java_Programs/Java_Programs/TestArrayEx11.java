//11.Java program to return an array from the method.
public class TestArrayEx11{
//creating a method which returns an array
 static int[] get(){
  return new int[] {33,55,88,66,99};//anonymous array
 }
  public static void main(String args[]){
   int arr[]=get();//calling the method which returns an array
   for(int i=0;i<arr.length;i++)//display the result
   System.out.println(arr[i]);
 }
}


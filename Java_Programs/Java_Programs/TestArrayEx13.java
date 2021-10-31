//13.Java program to demonstrate the case of ArrayIndexOutOfBoundsException in a Java array.
public class TestArrayEx13{
 static int[] marks(){
   int arr[]={67,89,90,56};
   return arr;
 }
 public static void main(String args[]){
  int m[]=marks();
  for(int i=0;i<5;i++)
  System.out.println("Marks is ="+m[i]);
 }
}
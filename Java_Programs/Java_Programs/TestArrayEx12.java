//12.Java program to return an array from the method.
public class TestArrayEx12{
 static int[] marks(){
   int arr[] ={22,44,77,55};
    return arr;
 }
  public static void main(String args[]){
   int m[]=marks();//calling the method which returns an array
   //display
   for(int value:m)
   System.out.println("Marks is ="+value);
 }
}

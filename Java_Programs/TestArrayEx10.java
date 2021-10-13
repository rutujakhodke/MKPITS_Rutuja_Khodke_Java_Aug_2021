//10.Java program to return an array from the method.
public class TestArrayEx10{
 static int[] marks(){//creating method which returns an array
    return new int[] {90,55,87,66,88};
 }
  public static void main(String args[]){
  int m[]=marks();//calling method which returns an array
  for(int value:m)
  System.out.println("Marks ="+value);
 }
}
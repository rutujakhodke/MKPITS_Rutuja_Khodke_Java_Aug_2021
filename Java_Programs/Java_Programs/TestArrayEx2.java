//2.Create an integer array of 5 elements to store 5 subject marks.calculate total,percentage.
import java.util.*;
public class TestArrayEx2{
 public static void main(String args[]){
 int[] arr=new int[5];
  int total=0;
  float percentage;
 Scanner s=new Scanner(System.in);
 for(int i=0;i<5;i++){
 System.out.println("Enter a Subject Marks :");
 arr[i]=s.nextInt();
  }
  //display the result
  for(int k=0;k<arr.length;k++){
	 System.out.println("Marks ="+arr[k]);
	 total=total+arr[k];
  }
   percentage=(float) (total/500.0f) * 100.0f;
   System.out.println("Total marks ="+total);
   System.out.println("Percentage ="+percentage);
 }
}
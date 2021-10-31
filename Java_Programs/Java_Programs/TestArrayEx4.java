//4.Create an integer array of 5 elements to store 5 subject marks.calculate total,percentage.(using for-each loop)
public class TestArrayEx4{
 public static void main(String args[]){
 int arr[]=new int[5];
  int total=0;
  float percentage;
 java.util.Scanner scan=new java.util.Scanner(System.in);
  for(int i=0;i<5;i++){
   System.out.println("Enter a Subject Marks :");
   arr[i]=scan.nextInt();
   }
   for(int i:arr){
    System.out.println("Marks ="+i);
    total=total+i;
  }
  percentage=(float) (total/500.0f) * 100.0f;
  System.out.println("Total Marks ="+total);
  System.out.println("Percentage ="+percentage);
 }
}
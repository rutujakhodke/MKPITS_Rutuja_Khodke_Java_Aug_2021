//6.Create an integer array of 5 elements to store 5 subject marks.calculate total,percentage.(using for-each loop) and passing array to a method.
public class TestArrayEx6{
 public static void main(String args[]){
 int arr[]=new int[5];
 java.util.Scanner scan=new java.util.Scanner(System.in);
  for(int i=0;i<5;i++){
   System.out.println("Enter a Subject Marks :");
   arr[i]=scan.nextInt();
  }
  calculate(arr);//passing array to a method calculate()
}
  //create a method calculate
  static void calculate(int marks[]){
   int total=0;
   float percentage;
   for(int i:marks){
    System.out.println("Marks ="+i);
    total=total+i;
   }
   percentage=(float) (total/500.0f)* 100.0f;
   System.out.println("Total Marks ="+total);
   System.out.println("Percentage ="+percentage);
  }
}


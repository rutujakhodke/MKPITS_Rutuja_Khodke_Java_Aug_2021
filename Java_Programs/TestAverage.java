//8.Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average.
class Average{
 int num1,num2,num3;

 public float calculateAverage(int num1,int num2,int num3){
   float average = (num1+num2+num3)/3;
   return average;
   }
}
class TestAverage{
public static void main(String args[]){
Average a1=new Average();
java.util.Scanner scan=new java.util.Scanner(System.in);
System.out.println("Enter a First Number :");
int num1=scan.nextInt();
System.out.println("Enter a Second Number :");
int num2=scan.nextInt();
System.out.println("Enter a Third Number :");
int num3=scan.nextInt();
float average=a1.calculateAverage(num1,num2,num3);
System.out.println("Average of 3 Numbers are ="+average);
 }
}
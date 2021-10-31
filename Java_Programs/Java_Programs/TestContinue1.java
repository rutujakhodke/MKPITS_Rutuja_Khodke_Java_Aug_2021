//3.wap in java to print odd no. between 1 and 10 using continue.
class TestContinue1{
public static void main(String args[]){
 int i;
 for(i=1;i<=10;i++){
   if(i%2==0){
     continue;
   }
   System.out.println("Number is ="+i);
 }

 }
}
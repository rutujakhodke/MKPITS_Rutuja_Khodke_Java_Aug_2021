//2.wap in java of continue statement.
class TestContinue{
public static void main(String args[]){
  int i=0;
   while(i<10){
    i++;
     if(i==4){
      continue;
     }
   System.out.println("Number is ="+i);//1 2 3 5.....
   }
   System.out.println("Out of while loop.");
   }
  }
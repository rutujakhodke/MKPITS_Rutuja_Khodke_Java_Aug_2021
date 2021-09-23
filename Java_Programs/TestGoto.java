//5.wap in java of goto statement to do calculation.
import java.util.*;
class TestGoto{
public static void main(String args[]){
 int n1,n2,res;
 char op;
 Scanner s=new Scanner(System.in);
 System.out.println("Enter a first number :");
 n1=s.nextInt();
 System.out.println("Enter a second number :");
 n2=s.nextInt();
 System.out.println("Enter a operator like +,-,* :");
 op=s.next().charAt(0);

 if(op=='+'){
	 goto add;

  }
  //creating labels for goto statement.
  add:
     System.out.println("Add");
     goto end;
  sub:
    System.out.println("Sub");
  mul:
    System.out.println("Mul");
  end:
    System.out.println("Bye");
 }
}
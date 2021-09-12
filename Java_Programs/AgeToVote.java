//4.wap to accept age from user and display whether he is eligible to vote or not.
import java.util.*;
class AgeToVote
{
 public static void main(String args[])
 {
	int age;
	Scanner s=new Scanner(System.in);
	System.out.println("enter a age :");
	age=s.nextInt();

	if(age>=18)
	{
		System.out.println("you are eligible to vote.");
	}
	else
	{
		System.out.println("you are not eligible to vote.");
	}
  }
}
//11.wap to accept a no. and then print a no. is armstrong no. or not.
import java.util.*;
class ArmstrongNo
{
public static void main(String args[])
{
	int num,originalnum,remainder,result=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number :");
	num=s.nextInt();
	originalnum=num;

	while(originalnum !=0)
	{
		remainder=originalnum % 10;
		result +=Math.pow(remainder,3);
		originalnum/=10;
	}
	if(result==num)
	System.out.println(num + " is an Armstrong number.");
	else
	System.out.println(num+ "is not an Armstrong number.");
 }
}





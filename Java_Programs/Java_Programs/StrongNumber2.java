//3.wap to print strong number between 100 and 50000.
class StrongNumber2
{
public static void main(String args[])
{
 int num=0, i;
 int rem;
 int fact=1 , sum=0;
 int originalNum=num;
 for(i=100;i<=50000;i++)
 {
	 sum=0;
	 num=i;
	 originalNum=num;

	 while(num !=0)
	 {
		 rem=num%10;
		 num=num/10;
		 fact=factorial(rem);
		 sum=sum+fact;
	 }
	 if(originalNum == sum)
	 {
		 System.out.println(originalNum+ "is a strong number.");
	 }

 }
 }
 public static int factorial(int r)
 {
	 int f=1;
	 while(r>0)
	 {
		 f=f*r;
		 r--;
	 }
	 return f;
 }
}
//9.wap to print prime no. between 1 and 20 using while loop.
class PrimeNo1To20
{
 public static void main(String args[])
 {
	 int i;
	 int num=1,count;
	 System.out.println("prime numbers between 1 and 20 are :");
	 while(num<=20)
	 {
		count=0;
		i=2;

	 while(i<=num/2)
	 {
		 if(num%i==0)
		 {
			 count++;
			 break;
		 }
		 i++;
	 }
	 if(count==0 && num!=1)
	 {
		 System.out.println("number is :"+num);
	 }
	 num++;
   }
 }
}
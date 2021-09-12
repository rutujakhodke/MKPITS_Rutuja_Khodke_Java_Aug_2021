//10.wap to print prime no. between 1 and 20 using do while loop.
class PrimeNoDoWhile
{
 public static void main(String args[])
 {
	 int i,count;
	 int num=1;
	System.out.println("prime numbers between 1 and 20 are :");
	do
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
	}while(num<=20);
 }
}


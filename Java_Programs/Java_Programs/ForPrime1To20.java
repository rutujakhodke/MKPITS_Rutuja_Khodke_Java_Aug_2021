//11.wap to print prime no. between 1 and 20 using for loop.
class ForPrime1To20
{
 public static void main(String args[])
 {
 int i=0,num=0;
 System.out.println("prime numbers from 1 to 20 are :");

 for(i=2;i<=20;i++)
 {
	int count=0;
	for(num=i;num>=1;num--)
	{
		if(i%num==0)
		{
			count=count+1;
		}
	}
	if(count==2)
	{
		System.out.println(i+ " ");
	}
 }
}
}


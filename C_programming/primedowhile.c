//wap to print prime nos.between 1 and 20 using do  while loop.
int main()
{
	int num=1,i,count;
	printf("prime numbers from 1 to 20 are :\n");
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
			printf("%d ",num);
		}
		num++;
	}while(num<=20);
}

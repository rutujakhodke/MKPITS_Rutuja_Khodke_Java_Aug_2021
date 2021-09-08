//3.wap to print strong no.between 100 and 50000.
int main()
{
	int num;
	int i;
	int originalnum;
	int rem;
	int fact;
	int sum=0;
	for(i=100;i<50000;i++)
	{
		sum=0;
		num=i;
		originalnum=num;
	
	while(num !=0)
	{
		rem=num%10;//145%10=14
		//printf("\n remainder =%d",rem);//14
		num=num/10;//14
		//printf("\n num=%d",num);//14
		fact=factorial(rem);//passing rem to function factorial.
		sum=sum+fact;//sum=120+24=144
	}
	if(originalnum==sum)
	{
		printf("\n no [%d] is strong no.",originalnum);
	}
   }
}
//creating function fact to calculate factorial of a no.
int factorial(int r)
{
	int f=1;
	while(r>0)
	{
		f=f*r;
		r=r-1;
	}
	return f;
}


//1.write a program of find the number is strong or not.
int main()
{
	int num=145;//145
	int originalnum=num;
	int rem;
	int fact;
	int sum=0;
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
	else
	{
		printf("\n no [%d] is not strong no.",originalnum);
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

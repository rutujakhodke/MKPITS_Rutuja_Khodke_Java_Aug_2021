//37.Write a C program to find Strong Numbers within a range of numbers.
#include<stdio.h>
int main()
{
	int i, fact=1,sum=0;
	int n1,n2,r;
	printf("\n Input starting range of number :");
	scanf("%d",&n1);
	printf("\n Input ending range of number :");
	scanf("%d",&n2);
	printf("\n the strong numbers are :");
	for(i=n1;i<=n2;i++)
	{
		int k=i;//k is a temporary variable
		while(k!=0)
		{
			r=k%10;
			fact=factorial(r);
			k=k/10;
			sum=sum+fact;
		}
		if(sum==i)
		{
			printf("%d ",i);
		}
		sum=0;
	}
	return 0;
}
  int factorial(int f)
  {
  	int  i,mul=1;
  	for(i=1;i<=f;i++)
  	{
  		mul=mul*i;
	}
	return mul;
}

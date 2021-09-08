//2.wap in C to display the n terms of square natural no. and their sum.1,4,9,16....n terms
#include<stdio.h>
void main()
{
	int i,n,sum=0;
	printf("input the number of terms : ");
	scanf("%d",&n);
	printf("\nthe square natural upto %d terms are :",n);
	for(i=1;i<=n;i++)
	{
		printf("%d  ",i*i);
		sum+=i*i;
	}
	printf("\nthe sum of square natural number upto %d terms = %d ",n,sum);
	
}

//wap to accept a number and print factorial of a no.using do while loop.
#include<stdio.h>
int main()
{
	int num;
	int i=1;
	int fact=1;
	printf("enter a number :");
	scanf("%d",&num);
	do
	{
		fact=fact*i;
		i++;
	}while(i<=num);
	printf("\n factorial of a %d =%d",num,fact);
	
	return 0;
}

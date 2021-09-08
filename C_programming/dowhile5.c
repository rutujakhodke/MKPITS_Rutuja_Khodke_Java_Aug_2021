//8.wap to accept a number and print factorial of a no.using do while loop.
#include<stdio.h>
int main()
{
	int num,fact=1;
	int i=1;
	printf("\n enter a number :");
		scanf("%d",&num);
	do
	{
		  fact=fact*i;
		  i++;
    }while(i<=num);
    printf("\n factorial of a number is :%d",num,fact);
    getch();
}

//6.wap to accept a number and print square of that no.
#include<stdio.h>
int main()
{
	int num,square;
	char ans;
	do
	{
		printf("enter a number :");
		scanf("%d",&num);
		square=num*num;
		printf("\n square of a number :%d",square);
		printf("\n do you want to continue if yes press y otherwise n.");
		fflush(stdin);
		scanf("%c",&ans);
	}while(ans=='y');
	printf("\n bye");
}

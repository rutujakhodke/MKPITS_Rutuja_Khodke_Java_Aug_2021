//7.wap to print a table.
#include<stdio.h>
int main()
{
	int num,result;
	int i=1;
	char ans;
	do
	{
		printf("\n enter a number :");
		scanf("%d",&num);
		i=1;
		while(i<=10)
		{
			result=num*i;
			i++;
			printf("\n %d * %d =%d",num,i,result);
		}
		printf("\n do you want to continue if yes press y otherwise n.");
		fflush(stdin);
		scanf("%c",&ans);
	}while(ans=='y');
	printf("\n bye");
}

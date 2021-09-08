//6.wap to create an double array of 5 elements to store 5 characters accept 5 characters from the user and store it in an array  
//using for loop then display the value stored in an array .
#include<stdio.h>
int main()
{
	int i;
	double num[5];//accepting double decimal no. from user
	for(i=0;i<5;i++)
	{
		printf("enter a number");
		fflush(stdin);
		scanf("%lf",&num[i]);
	}
	//displaying double decimal no. stored in an array
	for(i=0;i<5;i++)
	{
		printf("\n num=%lf",num[i]);
	}
}

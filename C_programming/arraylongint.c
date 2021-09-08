//7.wap to create an int array of 3 elements to store 3 nos. accept 3 nos. from the user and store it in an array  
//using for loop then display the value stored in an array .
#include<stdio.h>
int main()
{
	long int i;//taking long datatype
	int num[3];
	for(i=0;i<3;i++)
	{
		printf("enter a number");
		fflush(stdin);
		scanf("%ld",&num[i]);
	}
	//displaying the nos.stored in an array
	for(i=0;i<3;i++)
	{
		printf("\n num=%ld",num[i]);
    }
}

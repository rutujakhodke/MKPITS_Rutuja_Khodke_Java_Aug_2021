#include<stdio.h>
int main()
{
	int i;
	int num[3];
	int sum=0;//calculate sum of 3 nos. in an array
	//accepting the values from an user and stored in an array.
   //	printf("\n sum = %d",sum);
	for(i=0;i<3;i++)
	{
		printf("enter a number");
		scanf("%d",&num[i]);
		sum=sum+num[i];
	}
		printf("\n sum of the elements of an array =%d",sum);
	
	
}

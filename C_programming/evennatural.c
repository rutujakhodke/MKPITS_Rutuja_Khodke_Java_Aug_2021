//1.wap in C to display the n terms of even natural no. and their sum
#include<stdio.h>
void main(){
	int i, n, sum=0;
	printf("input number of terms : ");
	scanf("%d",&n);
	printf("\nthe even numbers are  :");
	for(i=1;i<=n;i++)
	{ 
		printf("%d ",2*i);
		sum+=2*i;
    }
    printf("\n the sum of even natural number upto %d terms : %d ",n,sum);
    
	
}

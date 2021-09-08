//7.wap to create a variable num and store value 5 in it,then create a pointer ptr and store the address of num variable 
//and print the value of num variable using pointer.
#include<stdio.h>
int main()
{
	int num=5;
	int *ptr;//create a pointer ptr
	ptr=&num;//store the address of num variable in ptr.
	
	printf("value in num variable=%d ",*ptr);//*ptr=5
	
}

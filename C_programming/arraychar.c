//5.wap to create an char array of 5 elements to store 5 characters accept 5 characters from the user and store it in an array  
//using for loop then display the value stored in an array .
#include<stdio.h>
int main()
{
	int i;
	char ch[5];//accepting characters from user
	for(i=0;i<5;i++)
	{
		printf("enter a character");
		fflush(stdin);
		scanf("%c",&ch[i]);
		
	}
	//displaying the stored characters in an array by using for loop
	for(i=0;i<5;i++)
	{
		printf("%c",ch[i]);
	}
	
}

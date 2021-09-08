//3.wap to accept 2 no. and operator like +,-,* and display the result.
#include<stdio.h>//#include it is preprocessor directive.
//stdio.h is a header file which will contain standard input output functions prototype.
int main()
{
	int num1,num2;
	int result=0;
	char op;
	
	printf("enter a 2 number :");
	scanf("%d%d",&num1,&num2);
	printf("enter operator like +,-,* :");
	fflush(stdin);
	scanf("%c",&op);
	if(op =='+')
	{
		result=num1+num2;
	}
	else if(op =='-')
	{
		result=num1-num2;
	}
	else if(op =='*')
	{
		result=num1*num2;
	}
	else
	{
		printf("not a valid operator.");
	}
	printf("\n result =%d",result);
	getch();
	return 0;
}


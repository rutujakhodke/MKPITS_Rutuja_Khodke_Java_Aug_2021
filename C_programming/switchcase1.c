//2.wap to accept 2 no. and operator like +,-,* and then display the result using switch.
#include<stdio.h>
int main()
{
	int num1,num2,result=0;
	char op;
	printf("enter a 2 number :");
	scanf("%d%d",&num1,&num2);
	printf("enter +,-,*,/  :");
	fflush(stdin);
	scanf("%c",&op);
	switch(op)
	{
		case'+':
			result=num1+num2;
			break;
		case'-':
			result=num1-num2;
			break;
		case'*':
			result=num1*num2;
			break;
		case'/':
			result=num1/num2;
			break;	
		default	:
		    printf("\n invalid operator.");
			break; 	
	}
	printf("\n result =%d",result);
	return 0;
}

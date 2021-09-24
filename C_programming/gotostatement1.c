//5.wap to accept a 2 no. and operator and display the result using goto statement.
#include<stdio.h>
int main(){
	int n1,n2,res;
	char op="+,-,*";
	printf("Enter a 2 number :");
	scanf("%d %d",&n1,&n2);
	fflush(stdin);
	printf("Enter a operator like +,-,* :");
	scanf("%c",&op);
	if(op=='+'){
		goto addition;
	}
	else if(op=='-'){
		goto substraction;
	}
	else if(op=='-'){
		goto multiplication;
	}
	else{
		printf("\n invalid operator");
		goto end;
	}
 //creating labels for goto statement.
 	addition:
 		res=n1+n2;
 		goto end;
 	substraction:
	    res=n1-n2;
		goto end;
	multiplication:
	    goto end;
	end:
	    printf("\n result =%d",res);			
}

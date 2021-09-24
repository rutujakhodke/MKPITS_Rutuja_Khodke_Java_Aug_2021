//4.example of goto statement in c to do calculation.
#include<stdio.h>
int main(){
	int n1,n2,res;
	char op;
	printf("Enter a two number :");
	scanf("%d %d",&n1,&n2);
	fflush(stdin);//used to clear buffer memory
	printf("Enter a operator like +,-,* :");
	scanf("%c",&op);
	if(op=='*'){
		goto mul;
	}
	//creating labels for goto statement.
	add:
		printf("\n add");
		//goto end;
	sub:
	   printf("\n sub");
	mul:
	   printf("\n mul");
	   goto end;
	end:
	   printf("\n bye");      	
   }

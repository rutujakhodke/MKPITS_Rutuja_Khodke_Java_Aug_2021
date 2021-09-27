//7.wap to create a function calculate with 3 parameters (2 int and one char to accept 2 no.and operator)calculate and display the result.
#include<stdio.h>
void calculate(int n1,int n2,char op){
	int result;
 switch(op){
 	case'+':
 		result=n1+n2;
 		break;
 	case'-':
	    result=n1-n2;
		break;	
 	case'*':
 		result=n1*n2;
 		break;
 	default:
	    printf("\n invalid operator");
		break;	
  }	
  printf("\n Result=%d",result);
}
int main(){
 int n1,n2;
 char op;
 printf("Enter a 2 No. :");
 scanf("%d %d",&n1,&n2);
 printf("Enter a operator like +,-,* :");
 fflush(stdin);
 scanf("%c",&op);
 //calling the function calculate and passing 3 arguments
 calculate(n1,n2,op);
printf("\n Bye from main function.");	
}

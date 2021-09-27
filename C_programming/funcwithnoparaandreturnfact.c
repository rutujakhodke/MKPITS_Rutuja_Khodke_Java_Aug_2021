//13.wap to create a function factorial,calculate factorial and return the factorial.
int factorial(){
	int num,fact=1;
	printf("Enter a Number :");
	scanf("%d",&num);
	
	while(num>0){
		fact=fact*num;
		num--;
	}
	return fact;
}
int main(){
	int result;
	result=factorial();
	printf("\n Factorial of a Number is =%d",result);
}

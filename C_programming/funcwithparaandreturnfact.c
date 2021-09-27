//12.wap to create a function factorial with one int parameter ,calculate factorial and return the factorial.
int factorial(int num){
	int fact=1;
	while(num>0){
		fact=fact*num;
		num--;
	}
	return fact;
}
int main(){
	int num;
	int result;
	printf("Enter a Number :");
	scanf("%d",&num);
	result=factorial(num);
	printf("\n Factorial of a Number is =%d",result);
}

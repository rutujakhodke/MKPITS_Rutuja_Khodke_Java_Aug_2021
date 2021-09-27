//8.wap to create a function factorial with one int parameter,calculate and display the factorial of that no.
void factorial(int num){
	int fact=1;
	while(num>0){
	 fact=fact*num;
	 num--;	
	}
	printf("\n Factorial of a Number is %d",fact);
}
int main(){
 int num,result;
 printf("Enter a Number :");
 scanf("%d",&num);
 factorial(num);
 printf("\n Bye from main function.");
}

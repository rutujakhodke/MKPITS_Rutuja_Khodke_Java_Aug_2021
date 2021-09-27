//6.wap to create a function sum with 2 int parameters and write code in it to add and display the addition of 2 no.
void sum(int num1,int num2){
	int result=num1+num2;
	printf("\n Addition of 2 Number is %d",result);
}
int main(){
	int num1,num2;
	printf("Enter a 2 Number :");
	scanf("%d %d",&num1,&num2);
	//calling function sum and passing parameters
	sum(num1,num2);
	printf("\n Bye from main function");
}

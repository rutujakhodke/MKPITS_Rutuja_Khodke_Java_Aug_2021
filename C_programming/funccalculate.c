//18.wap to create a function calculate with two integer arguments and																							
	//return the addition of two arguments.		
																						
int calculate(int n1,int n2)
{
	int sum;
	sum=n1+n2;
	return sum;
}
int main()
{
	int num1,num2,result;
	printf("enter a number :");
	scanf("%d%d",&num1,&num2);
	result=calculate(num1,num2);
	printf("sum=%d",result);
}

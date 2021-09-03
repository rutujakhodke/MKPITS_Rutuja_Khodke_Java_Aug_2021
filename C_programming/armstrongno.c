//29.Write a C program to check whether a given number is an armstrong number or not.
int main()
{
	int num,originalNum,remainder,result = 0;
	printf("Enter a three digit number :");
	scanf("%d",&num);
	originalNum=num;
	
	while(originalNum !=0)
	{
		//remainder contains the last digit
		remainder=originalNum % 10;
		
		result += remainder * remainder * remainder; 
		//removing last digit from the original no.
		originalNum /= 10;
		
	}
	if(result == num)
	printf("%d is an armstrong number.",num);
	else
	printf("%d is not  an armstrong number.",num);
	return 0;
}																							

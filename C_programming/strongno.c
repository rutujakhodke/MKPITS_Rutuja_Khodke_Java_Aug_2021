//36.Write a C program to check whether a number is a Strong Number or not.																							
int main()
{
	int i,originalNum,num,lastDigit,sum;//originalNum is a temporary no. to hold num value in it.
	long fact;
	
	printf("enter any number to check strong number :");
	scanf("%d",&num);
	
	//copy a value of num to a temporary variable
	originalNum = num;
	sum=0; 
	while(num>0)//find sum of factorial of digits
	{
		lastDigit=num %10;//get last digit of num
		//find factorial of last digit.
		fact=1;
		for(i=1;i<=lastDigit;i++)
		{
			fact = fact*i;
		}
		//add factorial to sum
		sum=sum+fact;
		num=num/10;
	}
	if(sum==originalNum)
	{
		printf("%d is a strong number",originalNum);
	}
	else
	{
		printf("%d is not a strong number",originalNum);
	}
	
}																							


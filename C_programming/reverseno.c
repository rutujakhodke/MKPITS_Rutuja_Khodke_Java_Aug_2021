//33.Write a program in C to display the number in reverse order.
int main()
{
	int num , reverse=0;
	printf("enter a number :");
	scanf("%d",&num);
	//repeat till num becomes 0.
	while(num !=0)
	{
		//increase place value of reverse & add a last digit to it.
		reverse=(reverse * 10) + (num % 10);
		num/=10;//remove last digit from num.
	}
	printf("Reverse = %d",reverse);
	return 0;
}																							

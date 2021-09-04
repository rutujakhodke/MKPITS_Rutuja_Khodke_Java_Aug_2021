//30.Write a C program to determine whether a given number is prime or not.
int main()
{
	//isPrime is used as flag variable.
	//if isPrime=0 then no. is composite.
	//else if isPrime =1 then no. is prime.
	int i,num,isPrime;
	
	// initially assumed the no.as prime no.
	(isPrime = 1);
	printf("enter a number :");
	scanf("%d",&num);
	
	for(i=2;i<=num/2;i++)
	{
		if(num%i==0)//check divisibility of num
		{
			//set isPrime to 0 indicating is an composite no.
			(isPrime=0);
			break;
		}
	}
	if(isPrime == 1 && num>1)//if isPrime contains 1 then it is prime.
	{
		printf("%d is a prime number.",num);
	}
	else
	{
		printf("%d is not a  prime number.",num);
	}
}																							

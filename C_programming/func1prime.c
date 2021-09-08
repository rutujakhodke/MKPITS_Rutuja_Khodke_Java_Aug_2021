//23.create a function to check whether no is prime or not.																							
//function declaration.
#include<stdio.h>
#include<math.h>
 int isPrime(int num);
 int main()
 {
 	int num;
 	printf("enter a number :");
 	scanf("%d",&num);
 	
 	//calling function.
 	if(isPrime(num))
 	{
 		printf("%d is a prime number. \n",num);
	}
	else
	{
		printf("%d is not a prime number. \n",num);
    }
}
 	//return 1 if no.is prime otherwise 0.
 	int isPrime(int num)
 	{
 		int i;
 		for(i=2;i<=num/2;i++)
 		{
 			if(num%i ==0)//if the no. is divisible by any no.other than 1 and self then it is not a prime.
 			{
 				return 0;
			}
		}
		return 1;
	}
 
												

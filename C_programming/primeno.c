//12.wap to accept a no. and print whether it is a prime no. or not.

int main()
{
	int n,i,flag=0;
	printf(" enter a number :");
	scanf("%d",&n);
	 for(i=2;i<=n/2;i++)
	 {
	 	//condition for non prime.
	 	if(n%i == 0)
	 	{
	 		flag = 1;
	 		break;
		}
	 }
	 if(n == 1)
	 {
	 	printf("1 is neither prime nor composite.");
	 }
	 else{
	 	if (flag == 0)
	 	printf("%d is a prime no.",n);
	 	else
	 	printf("%d is not a prime no.",n);
	 	
	     }
	 
}

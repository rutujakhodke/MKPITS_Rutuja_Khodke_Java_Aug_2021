//34.Write a program in C to check whether a number is a palindrome or not.
int main()
{
	int n,num,rev=0;
	printf("enter a number :");
	scanf("%d",&n);
	//copy original value of num to n.
	num=n;
	//find reverse of n and store in rev.
	while(n !=0)
	{
		rev = (rev * 10) + (n % 10);
		n /=10;
	}
	//check if rev is equal to num or not.
	if(rev == num)
	{
		printf("%d is a palindrome number.",num);
	}
	else{
		printf("%d is not a palindrome number.",num);
	}
}																							

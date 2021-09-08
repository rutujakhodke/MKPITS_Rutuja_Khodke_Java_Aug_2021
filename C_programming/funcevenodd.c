//21.create a function to check whether no is even or odd.
int isEven(int num)//function to check even or odd
{
	return !(num & 1);//return 1 if num is even otherwise 0.
	
}
int main()
{
	int num;
	printf("enter a number :");
	scanf("%d",&num);
	
    if(isEven(num))//if iseven function returns 0 then the no. is even.
	{
		printf("the number is even.");
	}	
	else
	{
		printf("the number is odd.");
	}
	return 0;
}	
																						

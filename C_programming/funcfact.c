//22.create a function to calculate factorial of a number.
int fact()
{
  int i,fact=1,n;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
  	fact=fact*i;
  }	
  return fact;
}		
int main()
{
	printf("enter a number to find factorial :");
	printf("\n factorial of given number is :%d",fact());
	return 0;
}																					

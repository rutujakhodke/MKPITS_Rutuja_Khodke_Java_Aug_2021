//3.wap to check whether a given no. is a perfect number or not.

int main()
{
	int n,i,sum;
	
	printf("input the number : ");
	scanf("%d",&n);
	sum=0;
	printf(" the positive divisor  : ");
	for(i=1;i<n;i++)
	{
	 if(n%i==0)
	 {
	 	sum=sum+i;
	 	printf("%d  ",i);
	 }	
   }
   printf("\n the sum of the divisor is : %d",sum);
   if(sum==n)
    printf("\n so, the number is perfect.");
   else
    printf("\n so, the number is not perfect.");
    printf("\n");
    
}

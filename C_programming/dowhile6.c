//9.wap to accept a 5 subject marks using do while loop and print the sum of 5 subjects and percentage.
int main()
{
	int marks,sum,i=1;
	float per;
	do
	{
		printf("enter a marks  :,i :");
		scanf("%d",&marks);
		sum=sum+marks;
		i++;
	}while(i<=5);
	   printf("\n sum of 5 subject marks =%d",sum);
	   per=(float)(sum/500.0f)*100.0f;
	   printf("\n percentage =%f",per);
}

//10.wap to accept a 5 subject marks using while loop and print the sum of 5 subjects and percentage and grade.
int main()
{
	int marks,i=1,sum;
	float per;
	while(i<=5)
	{
		printf("enter a marks :,i");
	    scanf("%d",&marks);
		sum=sum+marks;
		i++;
	}
	printf("\n sum of 5 subject marks =%d",sum);
	per=(float)(sum/500.0f)*100.0f;
	printf("\n percentage =%f",per);
	 
	 if(per>=75)
	 {
	 	printf("\n grade=first.");
	 }
	 else if(per<=60)
	 {
	 	printf("\n grade=second.");
	 }
	 else
	 {
	 	printf("\n fail.");
	 }
}

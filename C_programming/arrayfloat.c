//4.wap to create an float array of 5 elements to store 5 decimal no. accept 5 no. from the user and store it in an array  
//using for loop then display the value stored in an array .
int main()
{
	int i;
	float num[5];
	for(i=0;i<5;i++)
	{
		printf("enter a number");
		scanf("%f",&num[i]);
		
	}
	//displaying the decimal no. stored in an array
	for(i=0;i<5;i++)
	{
		printf("\n num[%d]=%f",i,num[i]);
		
	}
}

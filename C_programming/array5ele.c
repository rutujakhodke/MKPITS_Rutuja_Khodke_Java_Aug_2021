//3.wap to create an integer array of 5 elements to store 5 no. accept 5 no. from the user and store it in an array  
// then display the value stored in an array .
int main()
{
	int i;//i is creating for for loop. 
	int num[5];
	// accepting the values from the user and storing it in an array
	for(i=0;i<5;i++)
	{
		printf("enter a number");
		scanf("%d",&num[i]);
		
	}
	//displaying the values stored in an array using for loop
	for(i=0;i<5;i++)
	{
		printf("\n num[%d]=%d",i,num[i]);
		
	}
	printf("\n");
	
}

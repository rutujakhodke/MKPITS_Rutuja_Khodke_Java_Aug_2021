//7.create a array of 2 rows and 4 columns.

int main()
{
	int arr[2][4];
	int row,col;
	for(row=0;row<2;row++)
	{
		for(col=0;col<4;col++)
		{
		    printf("enter a number");
			scanf("%d",&arr[row][col]);
			
		}
	}
	//displaying the values of an array
	
	for(row=0;row<2;row++)
	{
		for(col=0;col<4;col++)
		{
		printf("\t%d",arr[row][col]);
	    }
       printf("\n");
    }
}

//5.create a 2d array of 3 rows and 3 cols.

int main()
{
	int arr[3][3];
	int row,col;
	for(row=0;row<3;row++)
	{
		for(col=0;col<3;col++)
	 { 
		printf("enter a number");
		scanf("%d",&arr[row][col]);
	 }
	}
	// displaying the values of an array
	
	for(row=0;row<3;row++)
	{
		for(col=0;col<3;col++)
	 { 
		printf("\t%d",arr[row][col]);
	 }
	    printf("\n");
	}
}


//10.wap to print output like this.
//1 1 1
//1 1 1
//1 1 1
int main()
{
	int row,col,i,j;
	printf("Enter number of rows: ");
    scanf("%d", &row);
    printf("Enter number of columns: ");
    scanf("%d", &col);
	
	for(i=1; i<=row; i++)
	{
		for(j=1; j<=col; j++)
		{
			printf(" 1");
		}
		printf("\n");
	}
	
}

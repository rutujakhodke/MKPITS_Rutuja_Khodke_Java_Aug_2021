//6.wap to print output like this.
//1 2 3
//1 2
//1
int main()
{
	int row,col;
	for(row=3;row>0;row--)
	{
		for(col=1;col<=row;col++)
		{
			printf("\t %d",col);
		}
		printf("\n");
	}
}

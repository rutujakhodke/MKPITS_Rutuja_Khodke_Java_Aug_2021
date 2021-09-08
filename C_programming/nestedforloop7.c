//8.wap to print output like this.
//1 1 1
//2 2
//3
int main()
{
	int row,col;
	for(row=1;row<=3;row++)
	{
		for(col=row;col<=3;col++)
		{
			printf("\t %d",row);
		}
		printf("\n");
	}
}

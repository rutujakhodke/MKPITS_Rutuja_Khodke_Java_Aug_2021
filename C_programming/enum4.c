//4.wap of creating enum months.
enum months{january=1,february,march,april,may,june,july,august,september,november,december};

int main()
{
	enum months m;
	//printing the value of months
	int i;
	for(i=january;i<=december;i++)
	{
		printf(" %d,",i);
	}
	m=april;
	printf("\nthe value of m is :%d",m);
}



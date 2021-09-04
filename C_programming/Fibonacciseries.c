//32.Write a program in C to display the first n terms of Fibonacci series.	
int main()
{
	int i,n;
	//initalize first and second terms.
	int t1=0 , t2=1;
	//initalize the next term (3rd term).
	int nextTerm = t1+t2;
	
	printf("enter a number of terms :");
	scanf("%d",&n);
	
	//print the first 2 terms t1 and t2.
	printf(" Fibonacci series :%d,%d, ",t1 , t2);
	
	//print third to nth terms.
	for(i=3;i<=n;i++)
	{
		printf("%d, ",nextTerm);
		t1=t2;
		t2=nextTerm;
		nextTerm=t1+t2;
	}
}																						

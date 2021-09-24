//2.example of continue statement.
int main()
{
	int i=0;
	while(i<5){
		i++;
		if(i==4){
			continue;
		}
		printf("\n i=%d",i);
	}
	printf("\n out of while loop.");
}

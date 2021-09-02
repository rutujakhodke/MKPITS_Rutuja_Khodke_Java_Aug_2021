//15.wap to compare two string.
int main()
{
	char firstname[20];
	char lastname[15];
	printf("enter a firstname :");
	gets(firstname);
	printf("enter a lastname :");
	gets(lastname);
	
	if(strcmp(firstname,lastname)== 0)
	{
		printf("\n both strings are same");
	}
	else
	{
		printf("\n both strings are not same");
	}
}

	 

//14.wap to add two string using strcat function(concanating a string.).
int main()
{
	char firstname[30];
	char lastname[20];
	printf("enter a firstname :");
	gets(firstname);
	printf("enter a lastname :");
	gets(lastname);
	
	strcat(firstname,lastname);
	printf("\n name = %s",firstname,lastname);
	
}

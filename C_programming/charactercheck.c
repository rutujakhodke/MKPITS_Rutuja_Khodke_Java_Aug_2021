//15.write a c program to check whether a character is an alphabet,digit or special character.
int main()
{
	char ch;
	printf("enter a character :");
	scanf("%c",&ch);
	
	if((ch>='a' && ch<='z')  ||  (ch>='A' && ch<='Z'))//alphabet check.
	{
		printf("\n %c is an alphabet. ",ch);
	}
	else if(ch>='0' && ch<='9')
	{
		printf("\n %c is a digit. ",ch);
	}
	else
	{
		printf("\n %c is special character. ",ch);
	}
	return 0;
}

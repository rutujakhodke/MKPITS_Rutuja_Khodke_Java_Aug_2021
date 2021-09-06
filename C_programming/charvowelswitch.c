//3.wap to accept a character and print whether it is vowel or not using switch case.
int main()
{
	char ch;
	printf("enter any alphabet(a-z) :");
	scanf("%c",&ch);
	switch(ch)
	{
		case'a':
		case'e':
		case'i':
		case'o':
		case'u':
		printf("char is vowel.");
		break;
		default:
		printf("char is not vowel.");
		break;	
	}
}

//1.wap to accept a character and print whether it is vowel or not.
int main()
{
	char choice;
	printf("enter any alphabet (a-z) :");
	scanf("%c",&choice);
	if(choice=='a'|| choice=='e'|| choice=='i'|| choice=='o'|| choice=='u')
	{
		printf("char is vowel");
	}
	else
	{
		printf("char is not vowel.");
		
	}
}

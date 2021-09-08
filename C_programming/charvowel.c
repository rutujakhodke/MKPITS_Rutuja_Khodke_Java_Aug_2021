//8.wap to accept character and print whether it is vowel or not.

int main()
{
	char c;
	int lowercase_vowel,uppercase_vowel;//intialize the vowel in small char and in caps char.
	printf("Enter an alphabet :");
	scanf("%c",&c);
	//evaluate if variable c is a lowercase vowel.
	lowercase_vowel = (c== 'a' || c== 'e' || c== 'i' || c== 'o' || c== 'u');
	 
	 //evaluate if variable c is uppercase vowel.
	 uppercase_vowel = (c== 'A' || c== 'E' || c== 'I' || c== 'O' || c== 'U');
	 
	 //evaluate to true if c is a vowel.
	 if (lowercase_vowel || uppercase_vowel)
	 printf("%c is a vowel.",c);
	 else
	 printf("%c is a consonant.",c);
	 return 0;
	
}

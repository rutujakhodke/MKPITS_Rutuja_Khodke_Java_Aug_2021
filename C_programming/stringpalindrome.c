//17.wap to find whether string is palindrome or not.
int main()
{
	char name[30];
	char orgname[30];
	char revname[30];
	
	printf(" enter a name :");
	gets(name);
	strcpy(orgname,name);
	printf("\n orgname =%s",name);
	
	strrev(name);
	printf("\n revname =%s",name);
	
	if(strcmp(orgname,name) == 0)
	{
		printf("\n a string is a palindrome.");
	}
	else{
		printf("\n a string is not a palindrome.");
	}
}

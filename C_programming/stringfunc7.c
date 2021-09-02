//16.wap to reverse a string.
int main()
{
	char name[20];
	char revname[10];
	printf("enter a name :");
	gets(name);
	
	printf("\n name = %s",name);
	strrev(name);
	printf("\n after reversing name =%s",name);
}

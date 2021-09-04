//4.wap to accept a character from the user and then print the character entered.
void main()
{
	char ch;
	printf("enter a character :");
	scanf("%c",&ch);//%c is format specifier for character datatype.
	//will wait for user pressing enter key.
	printf("\n char =%c",ch);
	
	printf("\n enter another character.");
	ch=getch();//will not wait for entry key to be pressed and does not echo char.
	printf("\n char =%c",ch);
	
	printf("\n enter another character.");
	ch=getch();//will not wait for entry key but it will echo char.
	printf("\n char =%c",ch);
	
}

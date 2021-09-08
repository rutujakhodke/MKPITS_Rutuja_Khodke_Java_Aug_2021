//10.once a string is defined ,it cannot be reassigned to another set of characters .However 
//using pointer we can assign the set of characters to the string.

int main()
{
	char *p = "hello mkpits";
	printf("before assigning : %s\n",p);
	p="hello";
	printf("after assigning : %s\n",p);
	
}

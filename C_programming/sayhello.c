#include <stdio.h>
void sayhello()
{
	printf("\n hello from sayhello function ");
}

int main() {
	printf("\n calling the function sayhello");
	sayhello();
	printf("\n again calling sayhello function");
	sayhello();
	printf("\n exiting from main function");
	return 0;
}

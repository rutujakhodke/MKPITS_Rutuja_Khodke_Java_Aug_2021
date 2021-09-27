//5.wap to create a function square with one int parameter to accept a number and calculate and display the square of that no.
void square(int num){
	int square;
	square=num*num;
	printf("\n Square of a Number =%d",square);
}
int main(){
	//calling the function square and passing no. to function parameter
	int num;
	printf("Enter a Number :");
	scanf("%d",&num);
	square(num);
	printf("\n Bye from Main function.");
}

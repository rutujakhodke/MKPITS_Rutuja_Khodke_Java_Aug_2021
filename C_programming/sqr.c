//4.wap to create a function square with one int parameter to accept a no.and calculate and display the square of that no.

void square(int n1)
{
int square;
square=n1*n1;
 printf("\n square of a no. =%d",square);
	         
}
int main(){
	//calling a function square and passing the no.to function parameter 
	int num=2;
	square(num);
	printf("\n bye from main function");
	
}

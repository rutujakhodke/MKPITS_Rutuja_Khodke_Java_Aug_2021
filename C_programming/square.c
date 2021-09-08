//3.wap to create a function square to  accept a no. and display the square of that no. 
// creating a function square
void square()
{
	int n1,square;
	printf("enter a no.");
	scanf("%d",&n1);
	square=n1*n1;
	printf("\n square of a no. =%d",square);
	
 } 
 int main(){
//calling the function 
 	square();
 	printf("\n bye from main function");
 	
 }

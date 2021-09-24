//2.(function with no parameter and returning nothing (void)).wap to create a method sum to accept a 2 no. and display the addition of 2 no.
void sum(){
	int n1,n2,result;
	printf("Enter a 2 Number :");
	scanf("%d %d",&n1,&n2);
	result=n1+n2;
	printf("\n Addition of 2 number is :%d",result);
}
int main(){
	//calling the function.
	sum();
	printf("\n Bye from main function.");
}

//20.wap to create a function calculate with 3 float arguments and display																							
//the addition of 3 no.																							
void calculate(float n1,float n2,float n3)
{
	float result=n1+n2+n3;
	printf("\n addition of 3 number is %f",result);
}
int main()
{
	float n1,n2,n3;
	printf("enter 3 numbers :");
	scanf("%f%f%f",&n1,&n2,&n3);
	//calling function calculate and passing.
	calculate(n1,n2,n3);
	printf("\n bye from main function.");
	
}

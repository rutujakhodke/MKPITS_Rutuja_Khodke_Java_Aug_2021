//19.wap to create a function calculate with 3 float arguments and																							
//return the addition of 3 float numbers.																							
float calculate(float n1,float n2,float n3)
{
	float result=n1+n2+n3;
	
	return result;
}

int main()
{
	float n1,n2,n3,res;
	printf("enter 3 numbers :");
	scanf("%f%f%f",&n1,&n2,&n3);
	//calling function calculate and passing.
	res=calculate(n1,n2,n3);
	printf("\n result = %f",res);
}
	

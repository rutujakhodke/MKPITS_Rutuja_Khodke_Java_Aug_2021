//26.create a function to caluclate area of a rectangle.
float calculate_area(float l,float b)	
{
	return(l*b);
}

int main()
{
	float l,b,a;
	printf("enter length of a rectangle :");
	scanf("%f",&l);
	
	printf("enter breath of a rectangle :");
	scanf("%f",&b);
	
	a=calculate_area(l,b);//function calling
	printf("Area of rectangle :%f",a);
	return 0;
}																						

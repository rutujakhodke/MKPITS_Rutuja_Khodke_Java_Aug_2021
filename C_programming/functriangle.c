//25.create a function to calculate area of traingle.
float calculate_area(float h,float b)
{
	return(h*b/2);
	
}
int main()
{
	float h,b;
	float area;
	printf("enter height of triangle :");
	scanf("%f",&h);
	
	printf("\nenter base of triangle :");
	scanf("%f",&b);	
	area=calculate_area(h,b);
	printf("Area of triangle :%f",area);
	return 0;
}																							

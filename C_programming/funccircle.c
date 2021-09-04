//27.create a function to calculate area and circ. of a circle.

double getCircumference(double radius);
double getArea(double radius);//function declarations.

int main()
{
	float radius,circ,area;
	printf("enter radius of circle :");
	scanf("%f",&radius);
	
	circ=getCircumference(radius);//call getCircumference function.
	area=getArea(radius);//call getArea function
	
	printf("Circumference of the circle =%.2f units \n",circ);
	printf("Area of the circle=%.2f sq. units",area);
}		
double getCircumference(double radius)
{
	
	return(2 * 3.14 * radius);//PI=3.14	
}	
double getArea(double radius)
{
	
	return(3.14 * radius * radius);
}
																				

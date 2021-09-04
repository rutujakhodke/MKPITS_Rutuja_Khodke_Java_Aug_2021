//6.wap to accept radius of a circle and print area and circumference of a circle.
int main()
{
	int radius;
	float area,circ;
	printf("enter radius of a circle :");
	scanf("%d",&radius);
	area=3.14f*radius*radius;
	circ=2*3.14f*radius;
	printf("area of circle =%f",area);//%f format specifier for float datatype.
	printf("\n circmference of circle =%f",circ);
}

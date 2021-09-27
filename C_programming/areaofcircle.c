//10.wap to create a function calarea with one int parameter to accept radius ,calculate and display area and 
//circumference of a circle.
void calculateArea(int radius){
	float area=3.14*radius*radius;
	printf("\n Area of a Circle is=%f",area);
}
void calculateCirc(int radius){
	float circumference=2*3.14*radius;
	printf("\n Circumference of a Circle is =%f",circumference);
}
int main(){
	int radius;
	printf("\n Enter a radius of a Circle :");
	scanf("%d",&radius);
	calculateArea(radius);
	calculateCirc(radius);
}

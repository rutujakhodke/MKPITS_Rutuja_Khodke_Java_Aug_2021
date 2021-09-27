//14.wap to create a function factorial,calculate factorial and return the factorial.
//declaring function prototype
float calculateArea();

//creating main function
int main(){
	float result;
	result=calculateArea();
	printf("\n Area=%f",result);
}
float calculateArea(){
	int radius;
	float area;
	printf("Enter a radius :");
	scanf("%d",&radius);
	area=3.14*radius*radius;
	return area;
}


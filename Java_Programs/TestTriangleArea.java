//4.Write a program to print the area and perimeter(Perimeter = sum of the three sides) of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without
//any parameter in its constructor.
class Triangle{
 int a;
 int b;
 int c;

 public Triangle(){//default constructor
	 a=3;
	 b=4;//for area b-base
	 c=5;//for area c-height
 }
 void calculateArea(){
	double triangleArea=b*c/2;//formula for area of triangle =1/2*base*height
	System.out.println("Area of a Triangle is ="+triangleArea);
  }
 void calculatePerimeter(){
	int perimeter=a+b+c;
	System.out.println("Perimeter of a Triangle is ="+perimeter);
  }
}
class TestTriangleArea{
public static void main(String[] args){
Triangle t1=new Triangle();//it calls default constructor
t1.calculateArea();
t1.calculatePerimeter();
 }
}
//5.Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named
//'Triangle' with constructor having the three sides as its parameters.
class Triangle{
int a;
int b;
int c;

public Triangle(int a,int b,int c){//parametrized constructor
  this.a=a;
  this.b=b;//for area b-base
  this.c=c;//for area c-height
 }
void calculateArea(){
 double areaOfTriangle=b*c/2;//formula for area of triangle =1/2*base*height
 System.out.println("Area of Triangle is ="+areaOfTriangle);
 }
void calculatePerimeter(){
 int perimeter=a+b+c;
 System.out.println("Peimeter of a Triangle is ="+perimeter);
 }
}
class TestTriangleArea1{
public static void main(String[] args){
Triangle t1=new Triangle(3,4,5);//calls parametrized constructor
t1.calculateArea();
t1.calculatePerimeter();
 }
}
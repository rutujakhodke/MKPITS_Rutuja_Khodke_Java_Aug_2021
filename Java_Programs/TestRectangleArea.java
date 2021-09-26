//6.Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by creating a class named 'Rectangle' with a
//method named 'Area' which returns the area and length and breadth passed as parameters to its constructor.
class Rectangle{
 int length;
 int breadth;

 public Rectangle(int length,int breadth){//parametrized constructor
	 this.length=length;
	 this.breadth=breadth;
 }
 void calculateArea(){
 float areaOfRectangle=length*breadth;
 System.out.println("Area Of Rectangle is ="+areaOfRectangle);
  }
}
class TestRectangleArea{
public static void main(String[] args){
//creating 2 objects of Rectangle class
Rectangle r1=new Rectangle(4,5);
r1.calculateArea();

Rectangle r2=new Rectangle(5,8);
r2.calculateArea();
 }
}
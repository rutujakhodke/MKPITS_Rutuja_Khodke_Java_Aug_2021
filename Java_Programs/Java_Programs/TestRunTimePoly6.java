//6.Java runtime polymorphism Example: shape.
class Shape{
 void draw(){
  System.out.println("Drawing...");
 }
}
class Rectangle extends Shape{
 void draw(){
  System.out.println("Drawing Rectangle...");
 }
}
class Triangle extends Shape{
 void draw(){
  System.out.println("Drawing Triangle...");
 }
}
class Circle extends Shape{
  void draw(){
   System.out.println("Drawing Circle..");
 }
}
class TestRunTimePoly6{
public static void main(String args[]){
Shape s;//s is a reference variable of parent class
s=new Rectangle();
s.draw();

s=new Triangle();
s.draw();

s=new Circle();
s.draw();
 }
}
//6.Example of Abstract class.create a class shape,rectangle,circle having abstract method .
abstract class Shape{
 abstract void draw();//method without body
}
class Rectangle extends Shape{
 void draw(){
  System.out.println("Drawing Rectangle..");
  }
}
class Circle extends Shape{
 void draw(){
  System.out.println("Drawing Circle..");
 }
}
class TestAbstract6{
public static void main(String args[]){
 Shape s=null;
 s=new Circle();//create a reference variable of Shape class.
s.draw();

s=new Rectangle();
s.draw();
 }
}
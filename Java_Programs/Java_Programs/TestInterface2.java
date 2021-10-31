//2.create an interface shape having method declaration for draw() method.
interface Shape{
 void draw();
}
class Circle implements Shape{
 public void draw(){
  System.out.println("Code to draw a Circle..");
 }
}
class Rectangle implements Shape{
  public void draw(){
  System.out.println("Code to draw a Rectangle..");
 }
}
class TestInterface2{
public static void main(String args[]){
Shape s=null;
s=new Circle();
s.draw();

s=new Rectangle();
s.draw();
 }
}


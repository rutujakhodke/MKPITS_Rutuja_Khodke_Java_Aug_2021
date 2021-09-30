//1.create an interface shape having method declaration for draw() method.
interface Shape{
 void draw();//method without body
}
class Circle implements Shape{
 public void draw(){
  System.out.println("Code to draw a Circle..");
 }
}
class TestInterface1{
public static void main(String args[]){
Shape s=new Circle();//s is reference variable of Shape class(parent).
s.draw();
 }
}
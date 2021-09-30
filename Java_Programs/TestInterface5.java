//5.Java Interface Example:Shape
interface Shape{
 void draw1();
 }
class Circle implements Shape{
 public void draw1(){
  System.out.println("Circle coding..");
 }
}
class TestInterface5{
 public static void main(String args[]){
 Circle c=new Circle();
 c.draw1();
 }
}
//6.Java Interface Example:Drawable
//interface declaration:by first user
interface Drawable{
 void draw();
}
//implementation:by second user
class Rectangle implements Drawable{
 public void draw(){
 System.out.println("Drawing Rectangle....");
 }
}
class Circle implements Drawable{
 public void draw(){
 System.out.println("Drawing Circle..");
 }
}
//using interface:by third user
class TestInterface6{
 public static void main(String args[]){
 Drawable d=new Circle();
 d.draw();
 d=new Rectangle();
 d.draw();
 }
}

//12.Example of Interface.we can have static method in interface.
interface Drawable{
 void draw();
 static int cube(int n){
  return n*n*n;
 }
}
class Rectangle implements Drawable{
 public void draw(){
  System.out.println("Drawing Rectangle..");
 }
}
class TestInterface10{
 public static void main(String args[]){
 Drawable d=new Rectangle();
 d.draw();
 System.out.println(Drawable.cube(2));
 }
}
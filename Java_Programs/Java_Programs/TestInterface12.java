//14.Example of Interface.Nested Interface in java.
interface Drawable{
 void draw();
  interface DrawCube{
   int cube(int n);
  }
}
class Rectangle implements Drawable.DrawCube{
 public void draw(){
  System.out.println("Drawing Rectangle..");
 }
 public int cube(int n){
  return n*n*n;
 }
}
class TestInterface12{
 public static void main(String args[]){
 Rectangle r=new Rectangle();
 r.draw();
 System.out.println("Cube is :"+r.cube(3));
 }
} 
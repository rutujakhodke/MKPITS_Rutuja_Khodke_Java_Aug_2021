//11.Example of Interface.we can have method body in interface,but we need to make it default method.
interface Drawable{
 void draw();
 default void msg(){
  System.out.println("Default method called...");
 }
}
class Rectangle implements Drawable{
 public void draw(){
  System.out.println("Drawing Rectangle...");
 }
}
class TestInterface9{
  public static void main(String args[]){
  Drawable d=new Rectangle();
  d.draw();
  d.msg();
 }
}

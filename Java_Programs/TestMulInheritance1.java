//9.Example of Multiple inheritance in Java by interface.(only one common method)
interface Printable{
 void run();
}
interface Showable{
 void run();
}
class Test implements Printable,Showable{
 public void run(){
  System.out.println("Running....");
 }
 void draw(){
  System.out.println("Drawing...");
  }
 }
 class TestMulInheritance1{
   public static void main(String args[]){
   Test t=new Test();
   t.run();
   t.draw();
  }
 }

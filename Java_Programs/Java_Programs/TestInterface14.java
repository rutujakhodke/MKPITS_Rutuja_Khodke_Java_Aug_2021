//16.A simple example where we are using interface and abstract class both.
//creating interface that has 4 methods
interface A{
 void a();//bydefault,public and abstract
 void b();
 void c();
 void d();
}
//creating abstract class that provides the implementation of one method of A Interface
abstract class B implements A{
 public void c(){
  System.out.println("I am C");
 }
}
 //creating subclass of abstract class,now we need to provide the implementation of rest of the methods.
 class M extends B{
  public void a(){
    System.out.println("I am A");
 }
 public void b(){
   System.out.println("I am B");
 }
 public void d(){
   System.out.println("I am D");
  }
 }
 //creating a test class that calls the methods of A interface
 class TestInterface14{
   public static void main(String args[]){
   A a=new M();
   a.a();
   a.b();
   a.c();
   a.d();
 }
}
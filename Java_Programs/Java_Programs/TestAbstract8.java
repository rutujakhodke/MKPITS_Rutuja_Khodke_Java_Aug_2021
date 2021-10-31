//8.Example of abstract class that has constructor ,abstract mthod and non abstract method.
abstract class Bike{
 Bike(){
  System.out.println("Bike is created");
 }
  abstract void run();
  void changeGear(){
   System.out.println("Gear changed");
  }
}
class Honda extends Bike{//creating a child class inherits abstract class
 void run(){
  System.out.println("Running safely..");
  }
}
class TestAbstract8{
 public static void main(String args[]){
 Bike b=new Honda();//it calls constructor
 b.run();
 b.changeGear();//it calls parent class method
 }
}
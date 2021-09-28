//4.Example of runtime polymorphism.we are creating 2 classes bike and splendor.splendor class extends bike class and overrides its run() method.(Upcasting)
class Bike{
 void run(){
  System.out.println("Bike is running");
 }
}
class Splendor extends Bike{
 void run(){//overriding base class method
  System.out.println("Running safely with 65 km");
 }
}
class TestRunTimePoly4{
public static void main(String args[]){
 Bike b=new Splendor();//upcasting (parent class reference variable refers to the child class object).
 b.run();

 //Bike b1=new Bike();//creating parent class object
 //b1.run();

 }
}
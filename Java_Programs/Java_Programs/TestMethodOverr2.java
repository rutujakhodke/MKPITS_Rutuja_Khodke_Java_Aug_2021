//4.example of method overriding.create a class vehicle,then craete a child class bike and car of parent class vehicle,in which method is same
class Vehicle{
 void run(){
 System.out.println("Vehicle is running.");
 }
}
class Bike extends Vehicle{
 void run(){
  System.out.println("Bike is running safely.");
 }
}
class Car extends Vehicle{
 void run(){
 System.out.println("Car is running.");
 }
}
class TestMethodOverr2{
 public static void main(String args[]){
 Car c=new Car();//create a instance of car class
 c.run();

 Bike b=new Bike();//create a instance of Bike class
 b.run();
 }
}
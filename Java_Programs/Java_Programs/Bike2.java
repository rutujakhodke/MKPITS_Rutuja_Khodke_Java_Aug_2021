//2.java program to demonstrate why we need method overriding ,we are calling the method of parent class with child class object.
class Vehicle{
void run(){
System.out.println("Vehicle is running");
 }
}
class Bike2 extends Vehicle{
public static void main(String args[]){
Bike2 b=new Bike2();
b.run();//it calls parent class method i.e Vehicle
 }
}
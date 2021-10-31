//3.java program to illustrate the use of java method overriding.
class Vehicle{
void run(){
System.out.println("Vehicle is running.");
 }
}
class Bike3 extends Vehicle{
void run(){
System.out.println("Bike is running safely.");
 }

 public static void main(String args[]){
 Bike3 b=new Bike3();
 b.run();//it calls run() method of Bike3 class
 }
}
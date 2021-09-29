//3.Example of abstract class that has an abstract method.
abstract class Bike{
 abstract void run();
}
 class Honda extends Bike{
 void run(){
 System.out.println("Bike is running safely.");
 }
}
class TestAbstract3{
public static void main(String args[]){
Bike b=new Honda();
b.run();
 }
}

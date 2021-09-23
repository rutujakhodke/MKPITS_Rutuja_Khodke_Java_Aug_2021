//1.example of private access modifier.
class Bike1{
 private int speed;//declare instance variable as a private.
 //creating a default constructor.
 Bike1(){
 System.out.println("Bike is created.");
 speed=100;
 }
 void display(){
 System.out.println("Speed of Bike is :"+speed);
 }
}
class TestBikeModifier{
public static void main(String args[]){
//calling a default constructor.

Bike1 b=new Bike1();
b.display();
 }
}
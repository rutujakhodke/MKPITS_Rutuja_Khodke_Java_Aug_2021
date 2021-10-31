//2.example of private access modifier.
class Bike1{
 private int speed;//declare instance variable as a private.
 //creating a default constructor.
 Bike1(){
 System.out.println("Bike is created.");
 speed=100;
 }
 private void display(){//create method as private
 System.out.println("Speed of Bike is :"+speed);
 }
}
class TestBikeModifier1{
public static void main(String args[]){
//calling a default constructor.

Bike1 b=new Bike1();
b.speed=20;//error since speed is declared as private.
b.display();//error since display is also declared as private.
 }
}
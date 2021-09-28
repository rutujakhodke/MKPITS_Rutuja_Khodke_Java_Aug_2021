//1.example of runtime polymorphism.create a class parent and then create a child class.we have to create a reference variable of parent class ,to access the child class object.
class Parent{//creating parent class
 void display(){
  System.out.println("Hello from Parent class of Display method.");
 }
}
//creating child class
class Child extends Parent{
 void display(){// overriding parent class display() method.
  System.out.println("Hello from Child class of Display method.");
 }
}
class TestRunTimePoly1{
public static void main(String args[]){
 Parent p;//p is reference variable of Parent class
 p=new Child();
 p.display();
 }
}
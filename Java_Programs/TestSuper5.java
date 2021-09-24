//4.create a Parent class Animal ,then create a child class Dog inherits from Animal class by using super keyword(invoke parent class method).
class Animal{
 void eat(){
 System.out.println("Eating..");
 }
}
class Dog extends Animal{
 void eat(){
  System.out.println("Eating Bread..");
 }
 void bark(){
  System.out.println("Barking..");
 }
 void work(){
  super.eat();
  bark();
  eat();
 }
}
class TestSuper5{
public static void main(String args[]){
Dog d=new Dog();
d.work();
 }
}

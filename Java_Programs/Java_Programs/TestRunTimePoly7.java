//7.Java runtime polymorphism Example: Animal.
class Animal{
 void eat(){
  System.out.println("Eating..");
 }
}
class Dog extends Animal{
 void eat(){//overriding base class eat() method
  System.out.println("Eating Bread..");
 }
}
class Cat extends Animal{
 void eat(){
  System.out.println("Eating Rat..");
 }
}
class Lion extends Animal{
 void eat(){
  System.out.println("Eating Meat..");
 }
}
class TestRunTimePoly7{
public static void main(String args[]){
Animal a;//a is areference variable of parent class Animal
a=new Dog();
a.eat();

a=new Cat();
a.eat();

a=new Lion();
a.eat();
 }
}

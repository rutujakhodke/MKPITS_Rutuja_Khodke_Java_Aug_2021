//11.(example of hierarchical inheritance).create a class Animal,then create a another class Dog inherited from Animal class ,and create a second class Cat which is also inherited from Animal class.
//creating super class Animal.
class Animal{
 void eat(){
 System.out.println("Eating...");
 }
}
//creating sub class Dog which is inherit from Animal class
class Dog extends Animal{
 void bark(){
 System.out.println("Barking....");
 }
}
//creating sub class Cat which is also inherit from Animal class.
class Cat extends Animal{
 void meow(){
 System.out.println("Meowing...");
 }
}
class TestInheritance9{
public static void main(String args[]){
Cat c=new Cat();
c.eat();
c.meow();
//c.bark();//compile time error
System.out.println("-------------------------------");
Dog d=new Dog();
d.eat();
d.bark();
//d.meow();//compile time error
 }
}
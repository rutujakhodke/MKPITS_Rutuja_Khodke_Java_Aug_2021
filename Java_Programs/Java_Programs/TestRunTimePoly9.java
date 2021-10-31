//9.Java runtime polymorphism with Multilevel inheritance.
class Animal{
 void eat(){
  System.out.println("Eating..");
 }
}
class Dog extends Animal{
 void eat(){
  System.out.println("Eating Biscuits..");
 }
}
class BabyDog extends Dog{//multilevel inheritance
 void eat(){
  System.out.println("Drinking milk...");
 }
}
class TestRunTimePoly9{
public static void main(String args[]){
Animal a1,a2,a3;//creating reference variable of parent class Animal
a1=new Dog();
a2=new Animal();
a3=new BabyDog();

a1.eat();
a2.eat();
a3.eat();
 }
}

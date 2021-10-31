//7.(example of multilevel inheritance)create a class Animal,then create a class Dog inherited from Animal class,then create a class BabyDog inherited from Dog class.
class Animal{
void eat(){
System.out.println("Eating..");
 }
}
class Dog extends Animal{
 void bark(){
 System.out.println("Barking..");
  }
}
class BabyDog extends Dog{
 void weep(){
 System.out.println("Weeping..");
 }
}
class TestInheritance5{
public static void main(String args[]){
BabyDog b1=new BabyDog();
b1.eat();
b1.bark();
b1.weep();
 }
}
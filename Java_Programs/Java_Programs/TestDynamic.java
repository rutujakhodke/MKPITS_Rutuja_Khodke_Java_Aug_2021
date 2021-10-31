//2.Example of Dynamic binding.
class Animal{
void eat(){
 System.out.println("Animal is eating...");
 }
}
class Dog extends Animal{
 void eat(){
  System.out.println("Dog is eating...");
 }
}
class TestDynamic{
 public static void main(String args[]){
 Animal a=new Dog();//a is a reference variable of parent class Animal.
 a.eat();
 }
}

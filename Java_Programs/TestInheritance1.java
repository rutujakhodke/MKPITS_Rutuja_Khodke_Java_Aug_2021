//3.example of single inheritance.Create a parent class Animal having method eat()  and then create a inherited class Dog having method bark().
class Animal{
void eat(){
 System.out.println("Eating...");
 }
}
class Dog extends Animal{
 void bark(){
  System.out.println("Barking...");
 }
}

class TestInheritance1{
 public static void main(String args[]){
 Dog d1=new Dog();
 d1.eat();
 d1.bark();
 }
}

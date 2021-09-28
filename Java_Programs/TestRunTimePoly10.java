//10.Example of runtime polymorphism.
class Animal{
 void eat(){
  System.out.println("Animal is Eating..");
 }
}
class Dog extends Animal{
 void eat(){
  System.out.println("Dog is Eating...");
 }
}
class BabyDog extends Dog{

}
class TestRunTimePoly10{
 public static void main(String args[]){
 Animal a=new BabyDog();
 a.eat();//it calls eat() method of Dog class bcoz BabyDog class not overriding eat() method.
 }
}
//4.Another example of super keyword where super keyword is provided by the compiler implicitly.
class Animal{
public Animal(){
 System.out.println("Animal is created");
 }
}
class Dog extends Animal{
 public Dog(){
  System.out.println("Dog is created");
 }
}
class TestSuperConstructorCall3{
public static void main(String args[]){
Dog d=new Dog();
 }
}
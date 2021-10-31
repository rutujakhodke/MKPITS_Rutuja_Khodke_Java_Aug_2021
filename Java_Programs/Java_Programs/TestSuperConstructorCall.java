//1.Example of super keyword.create a parent class Animal ,then create a child class Dog inherits from animal class,by using constructor to invoke parent class constructor.
class Animal{
Animal(){
System.out.println("Animal class is created.");
 }
}
class Dog extends Animal{
 Dog(){
 super();
 System.out.println("Dog class is created.");
 }
}
class TestSuperConstructorCall{
public static void main(String args[]){
Dog d=new Dog();//it calls dog class constructor
 }
}
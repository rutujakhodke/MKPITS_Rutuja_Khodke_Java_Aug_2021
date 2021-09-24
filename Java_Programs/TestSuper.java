//1.Create a class Animal ,then create a child class Dog inherited from Animal ,to refer the immediate parent class instance variable by using super keyword.
class Animal{
 String color="White";
}
class Dog extends Animal{
 String color="Black";
 
 void printColor(){
  System.out.println(color);//prints color of Dog class i.e Black
  System.out.println(super.color);//prints color of Animal class i.e White
 }
}
class TestSuper{
public static void main(String args[]){
Dog d=new Dog();
d.printColor();//call child class method 
 }
}
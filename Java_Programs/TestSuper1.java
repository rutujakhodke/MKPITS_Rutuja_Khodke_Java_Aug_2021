//2.Create a class Animal ,then create a child class Dog inherited from Animal ,then create a another child class BabyDog inherited from Dog class to refer the immediate parent class instance variable by using super keyword.
class Animal{
 String color="White";
}
class Dog extends Animal{
 String color="Black";

 void printColor(){
  System.out.println(super.color);//prints color of Animal class
 }
}
class BabyDog extends Dog{
 String color="Brown";

 void printColor1(){
 System.out.println(color);//prints color of BabyDog class
 System.out.println(super.color);//prints color of Dog class
 printColor();

 }
}
class TestSuper1{
public static void main(String args[]){
BabyDog b1=new BabyDog();
b1.printColor1();
 }
}


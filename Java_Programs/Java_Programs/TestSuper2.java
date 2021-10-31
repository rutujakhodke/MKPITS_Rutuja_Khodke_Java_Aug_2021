//3.Create a class Animal ,then create a child class Cow inherited from Animal ,then create a another child class BabyCow inherited from Cow class to refer the immediate parent class instance variable by using super keyword.
class Animal{
 String color="White";
}
class Cow extends Animal{
	String color="Brown";

void printColor(){
System.out.println(color);//it print Cow class color
System.out.println(super.color);//it prints Animal class color
 }
}
class BabyCow extends Cow{
 String color="Black";

 void printColor1(){
System.out.println(color);//it print BabyCow class color
System.out.println(super.color);//it print Cow class color
printColor();
 }
}
class TestSuper2{
public static void main(String args[]){
BabyCow c1=new BabyCow();
c1.printColor1();
 }
}

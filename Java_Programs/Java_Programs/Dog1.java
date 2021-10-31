//1.Example of Static Binding.
class Dog1{
 private void eat(){
  System.out.println("Dog is eating...");
 }
 public static void main(String args[]){
  Dog1 d1=new Dog1();
  d1.eat();
 }
}
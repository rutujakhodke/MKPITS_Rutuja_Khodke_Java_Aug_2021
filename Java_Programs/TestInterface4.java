//4.Java Interface Example.The printable interface has only one method and its implementation is provided in the child class.
interface Printable{
 void print();
}
class A6 implements Printable{
 public void print(){
  System.out.println("Hello Java");
 }
}
class TestInterface4{
 public static void main(String args[]){
 A6 a=new A6();//create a object of Child class (A6)
 a.print();
 }
}
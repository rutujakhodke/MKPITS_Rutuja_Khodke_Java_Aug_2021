//10.Example of Interface.A class implemnts interface,but one interface extends another interface.
interface Printable{
 void print();
}
interface Showable extends Printable{
 void show();
}
class Test implements Showable{
 public void print(){
  System.out.println("Hello..");
 }
 public void show(){
  System.out.println("Welcome..");
 }
}
class TestInterface8{
  public static void main(String args[]){
  Test t=new Test();
  t.print();
  t.show();
 }
}
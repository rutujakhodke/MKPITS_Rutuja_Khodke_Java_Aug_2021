//15.Example of Interface.
interface Printable{
 void print();
  interface MessagePrintable{
   void msg();
  }
}
abstract class Example implements Printable.MessagePrintable{
 public void print(){
  System.out.println("Printing..");
 }
 public void msg(){
  System.out.println("Message");
 }
}
class TestInterface13 extends Example{
  public static void main(String args[]){
  Example e=new TestInterface13();
  e.print();
  e.msg();
 }
}
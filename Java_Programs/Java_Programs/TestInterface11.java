//13.Example of Interface.Nested Interface in java.
interface Printable{
 void print();
  interface MessagePrintable{
   void msg();
  }
}
class Example implements Printable.MessagePrintable{
 public void print(){
  System.out.println("print..");
 }
 public void msg(){
  System.out.println("Message..");
 }
}
class TestInterface11{
 public static void main(String args[]){
 Example e=new Example();
 e.print();
 e.msg();
 }
}
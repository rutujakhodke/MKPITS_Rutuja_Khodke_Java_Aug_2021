//3.Example of Interface.
interface Printable{
 int MIN=5;
 void print();
}
class Printableex implements Printable{
 public void print(){
  System.out.println("min " +MIN);
 }
}
class TestInterface3{
public static void main(String args[]){
Printable p=new Printableex();
p.print();
 }
}
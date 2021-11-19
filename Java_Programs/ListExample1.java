//1.Java Awt List example.
import java.awt.*;
public class ListExample1{
 ListExample1(){
  Frame f=new Frame("List Example");

  List l1=new List(5);
  l1.setBounds(100,100,80,80);
  l1.add("C");
  l1.add("C++");
  l1.add("Java");
  l1.add("PHP");
  l1.add("Oracle");

  f.add(l1);
  f.setSize(400,400);
  f.setVisible(true);
  f.setLayout(null);
 }
   public static void main(String args[]){
   ListExample1 list=new ListExample1();
 }
}
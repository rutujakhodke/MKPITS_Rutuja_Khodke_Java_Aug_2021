//1.Java Awt Scrollbar Example.
import java.awt.*;
public class AwtScrollbarExample1{
 AwtScrollbarExample1(){
  Frame f=new Frame("Scrollbar Example");
  Scrollbar s=new Scrollbar();
  s.setBounds(100,100,50,100);
  f.add(s);

  f.setSize(400,400);
  f.setVisible(true);
  f.setLayout(null);
 }
  public static void main(String args[]){
    AwtScrollbarExample1 scrollbar=new AwtScrollbarExample1();
  }
}
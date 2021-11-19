//2.Java Awt Panel Example.
import java.awt.*;
public class AwtPanelExample2{
 AwtPanelExample2(){
  Frame f=new Frame("Panel Example");
  Panel panel=new Panel();
  panel.setBounds(40,50,200,200);
  panel.setBackground(Color.gray);
  f.add(panel);

  Button b1=new Button("Button 1");
  b1.setBounds(50,100,80,45);
  b1.setBackground(Color.yellow);
  panel.add(b1);

  Button b2=new Button("Button 2");
  b2.setBounds(100,100,80,45);
  b2.setBackground(Color.pink);
  panel.add(b2);

  Panel panel1=new Panel();
  panel1.setBounds(250,80,200,200);
  panel1.setBackground(Color.pink);
  f.add(panel1);

  Button b3=new Button("Button A");
  b3.setBounds(50,100,80,45);
  b3.setBackground(Color.orange);
  panel1.add(b3);

  Button b4=new Button("Button B");
  b4.setBounds(100,100,80,45);
  b4.setBackground(Color.red);
  panel1.add(b4);

  f.setSize(800,400);
  f.setVisible(true);
  f.setLayout(null);
  }
   public static void main(String args[]){
   AwtPanelExample2 panel=new AwtPanelExample2();
 }
}
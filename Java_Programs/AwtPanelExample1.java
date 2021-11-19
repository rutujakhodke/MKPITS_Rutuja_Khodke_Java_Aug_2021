//1.Java Awt Panel Example.
import java.awt.*;
public class AwtPanelExample1{
 AwtPanelExample1(){
  Frame f=new Frame("Panel Example");
  f.setSize(500,500);
  f.setVisible(true);
  f.setLayout(null);
   Panel panel=new Panel();
   panel.setBounds(30,90,300,300);
   panel.setBackground(Color.gray);
   f.add(panel);

   Button b1=new Button("Button 1");
   b1.setBounds(50,120,80,45);
   b1.setBackground(Color.pink);
   panel.add(b1);

   Button b2=new Button("Button 2");
   b2.setBounds(100,140,80,45);
   b2.setBackground(Color.red);
   panel.add(b2);
  }
   public static void main(String args[]){
   AwtPanelExample1 panel=new AwtPanelExample1();
  }
}
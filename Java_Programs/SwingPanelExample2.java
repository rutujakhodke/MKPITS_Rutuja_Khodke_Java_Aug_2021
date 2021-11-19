//2.Java Swing Panel Example.
import javax.swing.*;
import java.awt.*;
public class SwingPanelExample2{
 SwingPanelExample2(){
  JFrame f=new JFrame("JPanel Example");
  JPanel panel=new JPanel();
  panel.setBounds(40,50,200,200);
  panel.setBackground(Color.gray);
  f.add(panel);

  JButton b1=new JButton("Button 1");
  b1.setBounds(50,100,80,45);
  b1.setBackground(Color.yellow);
  panel.add(b1);

  JButton b2=new JButton("Button 2");
  b2.setBounds(100,100,80,45);
  b2.setBackground(Color.pink);
  panel.add(b2);

  JPanel panel1=new JPanel();
  panel1.setBounds(250,80,200,200);
  panel1.setBackground(Color.pink);
  f.add(panel1);

  JButton b3=new JButton("Button A");
  b3.setBounds(50,100,80,45);
  b3.setBackground(Color.orange);
  panel1.add(b3);

  JButton b4=new JButton("Button B");
  b4.setBounds(100,100,80,45);
  b4.setBackground(Color.red);
  panel1.add(b4);

  f.setSize(800,400);
  f.setVisible(true);
  f.setLayout(null);
  }
   public static void main(String args[]){
   SwingPanelExample2 panel=new SwingPanelExample2();
   }
  }
//1.Java Swing Panel Example.
import javax.swing.*;
import java.awt.*;
public class SwingPanelExample1{
 SwingPanelExample1(){
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

  f.setSize(500,500);
  f.setVisible(true);
  f.setLayout(null);
 }
 public static void main(String args[]){
  SwingPanelExample1 spanel=new SwingPanelExample1();
 }
}
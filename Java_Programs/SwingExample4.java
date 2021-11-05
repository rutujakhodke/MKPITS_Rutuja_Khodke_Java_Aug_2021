//4.Example of Swing by Inheritance.We can also inherit the JFrame class,so there is no need to create the instance of JFrame class explicitly.
import javax.swing.*;
public class SwingExample4 extends JFrame{//inheriting JFrame
 public SwingExample4(){
  setSize(300,300);
  setVisible(true);
  setLayout(null);
  setTitle("Swing Example");

  JButton b=new JButton("Click");
  b.setBounds(90,100,100,35);
  add(b);
 }
  public static void main(String args[]){
  SwingExample4 sw=new SwingExample4();
 }
}
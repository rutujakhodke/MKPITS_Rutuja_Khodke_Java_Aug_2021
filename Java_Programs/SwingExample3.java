//3.Example of Swing by Association inside Constructor.
//We can also write all the codes of creating JFrame JButton and method call inside the Java Constructor.
import javax.swing.*;
public class SwingExample3{
 JFrame f;
 JButton b1;
 public SwingExample3(){
  JFrame f=new JFrame("Swing Example");
  f.setSize(300,300);
  f.setVisible(true);
  f.setLayout(null);

  JButton b1=new JButton("Click");
  b1.setBounds(90,100,100,35);
  f.add(b1);
  }
  public static void main(String args[]){
  SwingExample3 sw=new SwingExample3();
 }
}

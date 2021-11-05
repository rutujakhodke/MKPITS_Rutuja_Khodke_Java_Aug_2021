//5.Java JButton Example with ActionListener.
import java.awt.event.*;
import javax.swing.*;
public class SwingExample5{
 public static void main(String args[]){
 JFrame f=new JFrame("Button Example");
 f.setSize(300,300);
 f.setVisible(true);
 f.setLayout(null);

 JTextField t1=new JTextField();
 t1.setBounds(50,60,160,35);
 f.add(t1);

 JButton b1=new JButton("Click Here");
 b1.setBounds(80,130,100,35);
 b1.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent ae){
   t1.setText("Welcome to MKPITS!!");
  }
 });
 f.add(b1);
}
}
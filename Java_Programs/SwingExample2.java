//2.Java Swing Example where we are creating one button and adding it on the JFrame object inside the main() method.(By creating object of Frame Class(Association))
import javax.swing.*;
import java.awt.event.*;
public class SwingExample2{
 public static void main(String args[]){
 JFrame f=new JFrame();
 f.setSize(300,300);
 f.setVisible(true);
 f.setLayout(null);
 f.setTitle("Swing Example");
 JButton b1=new JButton("Save");
 b1.setBounds(90,100,100,35);
 b1.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent ae){
  System.out.println("Hello from Save Button");
  }
 });
 f.add(b1);
 }
}
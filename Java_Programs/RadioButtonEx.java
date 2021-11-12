//1.Java JRadioButton example with ActionListener.
import javax.swing.*;
import java.awt.event.*;
public class RadioButtonEx extends JFrame implements ActionListener{
 JRadioButton rb1,rb2;
 ButtonGroup bg;
 JButton b1;
 public RadioButtonEx(){
  setSize(300,300);
  setVisible(true);
  setLayout(null);
  setTitle("RadioButton Example");

  rb1=new JRadioButton("Male");
  rb1.setBounds(100,50,50,50);
  add(rb1);

  rb2=new JRadioButton("Female");
  rb2.setBounds(100,100,50,50);
  add(rb2);

  bg=new ButtonGroup();
  bg.add(rb1);
  bg.add(rb2);

  b1=new JButton("Click");
  b1.setBounds(100,160,100,35);
  b1.addActionListener(this);
  add(b1);
 }
 public void actionPerformed(ActionEvent ae){
  if(rb1.isSelected()){
   JOptionPane.showMessageDialog(this,"You are Male");
  }
  if(rb2.isSelected()){
   JOptionPane.showMessageDialog(this,"You are Female");
  }
 }
 public static void main(String args[]){
  RadioButtonEx rb=new RadioButtonEx();
 }
}

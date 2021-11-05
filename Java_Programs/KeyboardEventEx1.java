//3.Java Awt Event handling Example of Keyboard Event Without adapter class.
import java.awt.*;
import java.awt.event.*;
public class KeyboardEventEx1 extends Frame implements KeyListener{
 TextField t1;
 Label l1;
 public KeyboardEventEx1(){
  setSize(300,300);
  setVisible(true);
  setLayout(null);
  setTitle("Keyboard Event Ex");

  l1=new Label("Enter a Character:");
  l1.setBounds(50,60,120,35);
  add(l1);

  t1=new TextField();
  t1.setBounds(50,100,120,30);
  t1.addKeyListener(this);
  add(t1);

 }
 public static void main(String args[]){
  KeyboardEventEx1 kb=new KeyboardEventEx1();
 }

 public void keyPressed(KeyEvent ke){
  System.out.println("Recently typed key in textfield are :" +ke.getKeyChar());
 }

 public void keyReleased(KeyEvent ke){
  //showStatus("Recently typed key in textfield are :");
  //t1.setText("Hello");
 }

 public void keyTyped(KeyEvent ke){
  System.out.println("Recently typed key in textfield are : " +ke.getKeyChar());
 }
}

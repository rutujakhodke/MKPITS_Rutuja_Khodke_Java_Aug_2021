//1.Java Awt event example.
import java.awt.*;
import java.awt.event.*;
//for button action event listener interface is actionlistener
class AwtEventEx1 extends Frame implements ActionListener{
 public AwtEventEx1(){
 setSize(300,300);
 setVisible(true);
 setLayout(null);
 Button b1=new Button("OK");
 b1.setBounds(90,100,100,35);
 //register the button component with the listener interface
 b1.addActionListener(this);
 add(b1);
 }
 //implementation of actionlistener interface method actionPerformed
 public void actionPerformed(ActionEvent ae){
  System.out.println("Hello from Button");
  }
 public static void main(String args[]){
  AwtEventEx1 e=new AwtEventEx1();
 }
}
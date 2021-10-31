//2.Example of event handling within same class with two buttons.
import java.awt.*;
import java.awt.event.*;
class AwtEventEx11 extends Frame implements ActionListener{
 TextField t1;
 Button b1,b2;
 public AwtEventEx11(){
  setSize(300,300);
  setVisible(true);
  setLayout(null);
  setTitle("Event Example");

  t1=new TextField();
  t1.setBounds(70,100,140,35);
  add(t1);

  b1=new Button("Click Me");
  b1.setBounds(40,190,100,30);
  b1.addActionListener(this);
  add(b1);

  b2=new Button("Clear");
  b2.setBounds(160,190,100,30);
  b2.addActionListener(this);
  add(b2);
 }
public void actionPerformed(ActionEvent ae){
 if(ae.getSource() == b1){
  t1.setText("Roshni");
 }
 if(ae.getSource() == b2){
  t1.setText("");
 }
}
 public static void main(String args[]){
 new AwtEventEx11();
 }
}

//1.Example of event handling within same class.
import java.awt.*;
import java.awt.event.*;
class AEvent extends Frame implements ActionListener{
 TextField t1;
 Button b1;
 public AEvent(){
  setSize(300,350);
  setVisible(true);
  setTitle("Event Example");
  setLayout(null);

  t1=new TextField();
  t1.setBounds(60,100,160,35);

  b1=new Button("Click Me");
  b1.setBounds(90,200,100,40);
  b1.addActionListener(this);

  add(t1); add(b1);

  }
 public void actionPerformed(ActionEvent ae){
 t1.setText("Welcome  to  MKPITS");
  }
 public static void main(String args[]){
  new AEvent();
 }
}
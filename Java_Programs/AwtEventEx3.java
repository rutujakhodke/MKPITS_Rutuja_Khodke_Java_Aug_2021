//3.Java Awt event example.Wap to accept a 2 number and print addition of 2 number.
import java.awt.*;
import java.awt.event.*;
//for button event action listener interface is actionlistener
class AwtEventEx3 extends Frame implements ActionListener{
 Label l1,l2,l3;
 TextField t1,t2;
 Button b1;
 public AwtEventEx3(){
  setSize(400,400);
  setVisible(true);
  setLayout(null);
  setTitle("Addition");

  //creating label for first number
  l1=new Label("Enter a Number1:");
  l1.setBounds(30,90,100,35);
  add(l1);
  //creating textfield for number
  t1=new TextField();
  t1.setBounds(150,90,200,30);
  add(t1);

  //creating label for second number
  l2=new Label("Enter a Number2:");
  l2.setBounds(30,150,100,35);
  add(l2);
  //creating textfield for number
  t2=new TextField();
  t2.setBounds(150,150,200,30);
  add(t2);

  //creating button for adding a number
  Button b1=new Button("ADD");
  b1.setBounds(150,220,100,35);
  //register the button component with the listener interface
  b1.addActionListener(this);
  add(b1);

  //creating label for addition of a number
  l3=new Label("Addition of a Number:");
  l3.setBounds(30,280,100,35);
  add(l3);
   }
 //implemention of actionlistener interface method actionperformed
 public void actionPerformed(ActionEvent ae){
  int num1=Integer.parseInt(t1.getText());
  int num2=Integer.parseInt(t2.getText());
  int res=num1+num2;
  l3.setText("Addition :"+res);
 }
 public static void main(String args[]){
 AwtEventEx3 e=new AwtEventEx3();
 }
}
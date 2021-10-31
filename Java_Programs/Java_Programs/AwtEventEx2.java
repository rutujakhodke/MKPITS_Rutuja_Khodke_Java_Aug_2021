//2.Java Awt event example.Wap to accept a number and print square of that number.
import java.awt.*;
import java.awt.event.*;
//for button event action listener interface is Actionlistener
class AwtEventEx2 extends Frame implements ActionListener{
  Label l1,l2;
  TextField t1;
  Button b1;
 public AwtEventEx2(){
  setSize(300,300);
  setVisible(true);
  setLayout(null);
  setTitle("Square");

  //creating label for accepting a number from user
  l1=new Label("Enter a Number :");
  l1.setBounds(30,50,100,35);
  add(l1);
  //creating textfield for number
  t1=new TextField();
  t1.setBounds(140,50,100,25);
  add(t1);

  //creating button for result
  Button b1=new Button("OK");
  b1.setBounds(100,110,50,25);
  //register the button component with the listener interface
  b1.addActionListener(this);
  add(b1);

  //creating label for square a number
  l2=new Label("Square :");
  l2.setBounds(30,150,100,25);
  add(l2);
 }
 //implementation of actionlistener interface method actionperformed
 public void actionPerformed(ActionEvent ae){
  int num1=Integer.parseInt(t1.getText());
  System.out.println("num is :"+num1);//to print the output on cmd
  int sqr=num1*num1;
  System.out.println("Square :"+sqr);
  l2.setText("Square :"+sqr);
 }
public static void main(String args[]){
 AwtEventEx2 e=new AwtEventEx2();
  }
}
//4.Java Awt event example.Wap to accept a 2 number and create a buttons for addition ,substraction and multiplication.
import java.awt.*;
import java.awt.event.*;
class AwtEventEx4 extends Frame implements ActionListener{
 Label l1,l2,l3;
 TextField t1,t2;
 Button b1,b2,b3;
  public AwtEventEx4(){
  setSize(400,400);
  setVisible(true);//to set the frame visible ,by default it is false
  setTitle("Calculation");
  setLayout(null);//no layout manager

  //creating label for number1
  l1=new Label("Enter a Number1:");
  l1.setBounds(40,100,100,35);
  add(l1);
  //creating textfield for number
  t1=new TextField();
  t1.setBounds(160,100,200,30);
  add(t1);

  //creating label for number2
  l2=new Label("Enter a Number2:");
  l2.setBounds(40,150,100,35);
  add(l2);
  //creating textfield for number
  t2=new TextField();
  t2.setBounds(160,150,200,30);
  add(t2);

  //creating button for addition
  b1=new Button("Addition");
  b1.setBounds(30,220,100,35);
  //register the button component with the listener interface
  b1.addActionListener(this);
  add(b1);

  //creating button for substraction
  b2=new Button("Substraction");
  b2.setBounds(150,220,100,35);
  //register the button component with the listener interface
  b2.addActionListener(this);
  add(b2);

  //creating button for multiplication
  b3=new Button("Multiplication");
  b3.setBounds(270,220,100,35);
  b3.addActionListener(this);
  add(b3);

  //creating label for result
  l3=new Label("Result:");
  l3.setBounds(40,270,100,35);
  add(l3);
  }
 //implementation of actionlistener interface method actionperformed
  public void actionPerformed(ActionEvent ae){
   int num1=Integer.parseInt(t1.getText());
   int num2=Integer.parseInt(t2.getText());
   int res=0;
    if(ae.getSource()==b1){
     res=num1+num2;
    }
    if(ae.getSource()==b2){
     res=num1-num2;
    }
    if(ae.getSource()==b3){
     res=num1*num2;
    }
   l3.setText("Result is: "+res);
  }
  public static void main(String args[]){
  AwtEventEx4 e=new AwtEventEx4();
 }
}
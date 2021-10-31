//6.Java Awt event example.Wap to accept a number and print factorial of a number.
import java.awt.*;
import java.awt.event.*;
class AwtEventEx6 extends Frame implements ActionListener{
 Label l1,l2;
 TextField t1;
 Button b1;
 public AwtEventEx6(){
 setSize(300,300);
 setVisible(true);
 setLayout(null);
 setTitle("Factorial");

 l1=new Label("Enter a Number: ");
 l1.setBounds(40,90,100,35);
 add(l1);
 t1=new TextField();
 t1.setBounds(150,90,90,30);
 add(t1);

 b1=new Button("OK");
 b1.setBounds(90,150,100,35);
 b1.addActionListener(this);
 add(b1);

 l2=new Label("Factorial: ");
 l2.setBounds(40,210,180,35);
 add(l2);

 }
 public void actionPerformed(ActionEvent ae){
  int num1=Integer.parseInt(t1.getText());
   int fact=1;
   while(num1>0){
     fact=fact*num1;
     num1=num1-1;
   }
   l2.setText("Factorial of a Number: " +fact);
 }
  public static void main(String args[]){
  AwtEventEx6 e=new AwtEventEx6();
 }
}
//7.Java Awt event example.Wap to accept a number and print whether it is a prime number or not.
import java.awt.*;
import java.awt.event.*;
class AwtEventEx7 extends Frame implements ActionListener{
Label l1,l2;
TextField t1;
Button b1;
public AwtEventEx7(){
 setSize(400,400);
 setVisible(true);
 setLayout(null);
 setTitle("Prime Number");

 l1=new Label("Enter a Number:");
 l1.setBounds(60,100,100,35);
 add(l1);
 t1=new TextField();
 t1.setBounds(180,100,100,30);
 add(t1);

 b1=new Button("OK");
 b1.setBounds(150,180,100,35);
 b1.addActionListener(this);
 add(b1);

 l2=new Label("Prime Number: ");
 l2.setBounds(60,250,120,35);
 add(l2);
  }
 public void actionPerformed(ActionEvent ae){
  int num1=Integer.parseInt(t1.getText());
   int i=2;
   boolean flag=false;
   while(i<=num1/2){
   //condition for non-prime
     if(num1 % i == 0){
      flag=true;
      break;
     }
    i++;
   }
   if(!flag)
    l2.setText(num1+ " is a Prime Number");
   else
    l2.setText(num1+ " is not a Prime Number");
 }
 public static void main(String args[]){
  AwtEventEx7 e=new AwtEventEx7();
 }
}

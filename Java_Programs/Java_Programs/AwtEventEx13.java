//.Example of event handling by Anonymous class .To accept a 2 no. from the user and display the addition of 2 no.
import java.awt.*;
import java.awt.event.*;
class AwtEventEx13 extends Frame{
 Label l1,l2,l3;
 Button b1;
 TextField t1,t2,t3;
 public AwtEventEx13(){
  setSize(400,400);
  setVisible(true);
  setLayout(null);
  setTitle("Addition");

  l1=new Label("Number1:-");
  l1.setBounds(40,70,100,35);
  add(l1);
  t1=new TextField();
  t1.setBounds(150,70,120,30);
  add(t1);

  l2=new Label("Number2:-");
  l2.setBounds(40,120,100,35);
  add(l2);
  t2=new TextField();
  t2.setBounds(150,120,120,30);
  add(t2);

  l3=new Label("Result:");
  l3.setBounds(40,170,100,35);
  add(l3);
  t3=new TextField();
  t3.setBounds(150,170,120,30);
  add(t3);

  b1=new Button("Addition");
  b1.setBounds(150,250,100,35);

  b1.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent ae){
   String str=t1.getText();
   double num1=Double.parseDouble(str);
   double num2=Double.parseDouble(t2.getText());
   t3.setText("Sum is: "+(num1+num2));
   }
  });
  add(b1);
  }
  public static void main(String args[]){
  new AwtEventEx13();
 }
}

//5.Example of event handling by Anonymous class with 2 buttons.
import java.awt.*;
import java.awt.event.*;
class AwtEventEx12 extends Frame{
 TextField t1;
 Button b1,b2;
 public AwtEventEx12(){
  setSize(300,300);
  setVisible(true);
  setLayout(null);
  setTitle("Awt Event");

  t1=new TextField();
  t1.setBounds(70,70,160,35);
  add(t1);

  b1=new Button("Click Me");
  b1.setBounds(100,140,100,30);

  b1.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent ae){
    t1.setText("Java Program");
   }
  });
  add(b1);
 b2=new Button("Clear");
 b2.setBounds(100,190,100,30);

 b2.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent ae){
   t1.setText("");
  }
 });
 add(b2);
}
public static void main(String args[]){
 new AwtEventEx12();
 }
}

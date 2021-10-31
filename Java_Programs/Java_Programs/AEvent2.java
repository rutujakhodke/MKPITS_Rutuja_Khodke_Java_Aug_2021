//3.Example of event handling by Outer class.
import java.awt.*;
import java.awt.event.*;
class AEvent2 extends Frame{
 TextField t1;
 Button b1;
 AEvent2(){
 setSize(300,300);
 setVisible(true);
 setTitle("Event Example");
 setLayout(null);

 t1=new TextField();
 t1.setBounds(60,60,170,35);
 add(t1);

 b1=new Button("Click Me");
 b1.setBounds(100,160,100,30);

 Outer o=new Outer(this);
 b1.addActionListener(o);//passing outer class instance
 add(b1);
  }
 public static void main(String args[]){
 new AEvent2();
  }
 }

////////////////////
 class Outer implements ActionListener{
  AEvent2 obj;
  Outer(AEvent2 obj){
   this.obj=obj;
  }
 public void actionPerformed(ActionEvent ae){
  obj.t1.setText("Welcome to Nagpur");
  }
 }


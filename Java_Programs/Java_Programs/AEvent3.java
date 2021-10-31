//4.Example of event handling by Anonymous class.
import java.awt.*;
import java.awt.event.*;
class AEvent3 extends Frame{
 TextField t1;
 Button b1;
 public AEvent3(){
  setSize(300,300);
  setVisible(true);
  setLayout(null);
  setTitle("Event Example");

  t1=new TextField();
  t1.setBounds(60,80,160,35);
  add(t1);

  b1=new Button("Click Me");
  b1.setBounds(90,170,100,30);

  b1.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent ae){
   t1.setText("Hello  and  Welcome");
    }
  });
  add(b1);
 }
  public static void main(String args[]){
  new AEvent3();
 }
}

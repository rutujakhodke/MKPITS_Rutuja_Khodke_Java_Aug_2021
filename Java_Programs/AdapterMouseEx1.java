//6.Java Awt Event Handling Example of Mouse with adapter class.Display the x an y co-ordinate in label when you move the mouse over frame.
import java.awt.*;
import java.awt.event.*;
public class AdapterMouseEx1 extends Frame{
 Label l1;
 public AdapterMouseEx1(){
  setSize(300,300);
  setVisible(true);
  setLayout(null);
  setTitle("Mouse Adapter Ex");

  l1=new Label("Move the mouse over Frame:");
  l1.setBounds(50,150,200,35);
  addMouseMotionListener(new MyMouseMotionAdapter(this));
  add(l1);

 }
  public static void main(String args[]){
  AdapterMouseEx1 am=new AdapterMouseEx1();
 }
}
class MyMouseMotionAdapter extends MouseMotionAdapter{
 AdapterMouseEx1 adapter;
 public MyMouseMotionAdapter(AdapterMouseEx1 adapter){
  this.adapter=adapter;
 }
 public void mouseMoved(MouseEvent me){
  adapter.l1.setText("Mouse is Moved  " + me.getX()+ "," + me.getY());
 }
}

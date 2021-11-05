//5.Java Awt Event handling Example of Keyboard Event With adapter class.
import java.awt.*;
import java.awt.event.*;
public class AdapterKeyEx1 extends Frame{
 Label l1;
 TextField t1;
 public AdapterKeyEx1(){
  setSize(300,300);
  setVisible(true);
  setLayout(null);
  setTitle("Key Adapter Ex");

  l1=new Label("Enter a Characters:");
  l1.setBounds(50,50,120,35);
  add(l1);

  t1=new TextField();
  t1.setBounds(50,100,150,30);
  t1.addKeyListener(new MyKeyAdapter(this));
  add(t1);
 }
  public static void main(String args[]){
  AdapterKeyEx1 ad=new AdapterKeyEx1();
 }
}
class MyKeyAdapter extends KeyAdapter{
 AdapterKeyEx1 adapter;
 public MyKeyAdapter(AdapterKeyEx1 adapter){
  this.adapter=adapter;
 }
 public void keyTyped(KeyEvent ke){
  System.out.println("Key Typed: "+ke.getKeyChar());
  char c=ke.getKeyChar();
  System.out.println("Key Typed: "+c);
  adapter.l1.setText(adapter.t1.getText());
 }
}
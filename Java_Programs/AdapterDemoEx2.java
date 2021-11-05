//4.Java Awt Event handling Example of Keyboard Event With adapter class.
import java.awt.*;
import java.awt.event.*;
public class AdapterDemoEx2 extends Frame{
 TextField t1;
 Label l1;
 public AdapterDemoEx2(){
  setSize(300,300);
  setVisible(true);
  setLayout(null);
  setTitle("Keyboard Event Ex");

  l1=new Label("MKPITS");
  l1.setBounds(50,70,100,35);
  add(l1);

  t1=new TextField();
  t1.setBounds(50,100,100,30);
  t1.addKeyListener(new MyKeyAdapter(this));
  add(t1);
 }
  public static void main(String args[]){
  AdapterDemoEx2 ad=new AdapterDemoEx2();
 }
}
class MyKeyAdapter extends KeyAdapter{
 AdapterDemoEx2 adapter;
 public MyKeyAdapter(AdapterDemoEx2 adapter){
  this.adapter=adapter;
 }
 public void keyTyped(KeyEvent ke){
  System.out.println("Key Typed in texfield are: "+ ke.getKeyChar());
 }
}
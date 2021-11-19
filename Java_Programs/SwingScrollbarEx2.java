//2.Java Swing Scrollbar Example with AdjustmentListener.
import javax.swing.*;
import java.awt.event.*;
public class SwingScrollbarEx2{
 SwingScrollbarEx2(){
  JFrame f=new JFrame("JScrollbar Example");
  JLabel l1=new JLabel();
  l1.setHorizontalAlignment(JLabel.CENTER);
  l1.setSize(400,100);
  f.add(l1);

  JScrollBar s=new JScrollBar();
  s.setBounds(100,100,50,70);
  f.add(s);

  f.setSize(400,400);
  f.setVisible(true);
  f.setLayout(null);

  s.addAdjustmentListener(new AdjustmentListener(){
   public void adjustmentValueChanged(AdjustmentEvent ae){
    l1.setText("Vertical Scrollbar value is :" +s.getValue());
   }
  });
 }
 public static void main(String args[]){
    SwingScrollbarEx2 scrollbar=new SwingScrollbarEx2();
   }
}

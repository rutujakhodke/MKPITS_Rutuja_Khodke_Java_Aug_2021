//3.Java Swing Scrollbar Example with AdjustmentListener.
import javax.swing.*;
import java.awt.event.*;
public class SwingScrollbarEx3{
  SwingScrollbarEx3(){
   JFrame f=new JFrame("Scrollbar Example");
   JLabel l1=new JLabel();
   l1.setHorizontalAlignment(JLabel.CENTER);
   l1.setSize(400,100);
   f.add(l1);

   JScrollBar s=new JScrollBar();
   s.setOrientation(0);
   s.setBounds(100,100,250,20);
   f.add(s);

   f.setSize(400,400);
   f.setLayout(null);
   f.setVisible(true);

   s.addAdjustmentListener(new AdjustmentListener(){
    public void adjustmentValueChanged(AdjustmentEvent ae){
    l1.setText("Vertical Scrollbar value is :" +s.getValue());
    }
   });
  }
  public static void main(String args[]){
   SwingScrollbarEx3 scrollbar=new SwingScrollbarEx3();
  }
}
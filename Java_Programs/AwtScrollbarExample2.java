//2.Java Awt Scrollbar Example with AdjustmentListener.
import java.awt.*;
import java.awt.event.*;
public class AwtScrollbarExample2{
 AwtScrollbarExample2(){
 Frame f=new Frame("Scrollbar Example");
 Label l1=new Label();
 l1.setAlignment(Label.CENTER);
 l1.setSize(400,100);
 f.add(l1);
 Scrollbar s=new Scrollbar();
 s.setBounds(100,100,50,100);
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
 AwtScrollbarExample2 scrollbar=new AwtScrollbarExample2();
}
}

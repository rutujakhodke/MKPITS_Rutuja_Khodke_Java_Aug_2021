//2.Java Awt ToolKit Example.beep()
import java.awt.*;
import java.awt.event.*;
public class ToolKitExample2{
 public static void main(String args[]){
 Frame f=new Frame("ToolKit Example");
 f.setSize(300,300);
 f.setVisible(true);
 f.setLayout(null);

 Button b=new Button("beep");
 b.setBounds(80,90,100,35);
 f.add(b);
 b.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent ae){
   Toolkit.getDefaultToolkit().beep();
  }
 });
}
}


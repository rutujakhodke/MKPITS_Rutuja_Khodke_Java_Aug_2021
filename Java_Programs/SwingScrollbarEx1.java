//1.Java Swing Scrollbar Example.
import javax.swing.*;
import java.awt.*;
public class SwingScrollbarEx1{
 SwingScrollbarEx1(){
  JFrame f=new JFrame("JScrollbar Example");
  JScrollBar s=new JScrollBar();
  s.setBounds(100,100,50,100);
  f.add(s);

  f.setSize(300,300);
  f.setVisible(true);
  f.setLayout(null);
   }
    public static void main(String args[]){
    SwingScrollbarEx1 scrollbar=new SwingScrollbarEx1();
   }
  }


//9.Java AWT example.Simple example of AWT by association.
import java.awt.*;
class First1{
 public First1(){
 Frame fr=new Frame();
 fr.setSize(300,300);
 fr.setVisible(true);
 fr.setLayout(null);
 Button b1=new Button("Click Me");
 b1.setBounds(90,100,100,35);
 fr.add(b1);
 }
 public static void main(String args[]){
 First1 f=new First1();
 }
}
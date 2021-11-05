//1.Java Swing Example where we are creating one button and adding it on the JFrame object inside the main() method.(By creating object of Frame Class(Association))
import javax.swing.*;
public class SwingExample1{
 public static void main(String args[]){
 JFrame f=new JFrame();//creating instance of Frame class
 f.setSize(300,300);//width 300 and height 300
 f.setLayout(null);//using no layout managers
 f.setTitle("Swing Example");
 f.setVisible(true);//making the frame visible
 JButton b1=new JButton("Click Me");//creating instance of Button class
 b1.setBounds(90,100,100,35);
 f.add(b1);//adding button in a frame
 }
}
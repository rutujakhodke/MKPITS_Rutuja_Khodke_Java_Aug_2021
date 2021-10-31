//8.Java AWT example.Simple example of AWT by inheritance.
import java.awt.*;
class First extends Frame{
 public First(){
 setSize(300,300);//set page size as 300 width and 300 height
 setVisible(true);//now frame will be visible,by default it is false
 setLayout(null);//no layout manager
 Button b1=new Button("Click Me");
 b1.setBounds(90,100,100,35);//set position of button
 add(b1);//adding button in frame
 }
 public static void main(String args[]){
 First f=new First();
 }
}
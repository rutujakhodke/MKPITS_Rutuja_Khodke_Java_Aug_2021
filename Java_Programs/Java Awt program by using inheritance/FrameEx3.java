//3.Java AWT example.To create a button inside frame.(By extending frame class (inheritance)).
import java.awt.*;
class FrameEx3 extends Frame{
 public FrameEx3(){
 setSize(400,400);
 setVisible(true);
 //create a button in frame
 Button b1=new Button("Ok");
 b1.setBounds(140,100,110,50);
 add(b1);
 setLayout(null);
 setTitle("MKPITS Solutions");
 }

 public static void main(String args[]){
  FrameEx3 f=new FrameEx3();
 }
}
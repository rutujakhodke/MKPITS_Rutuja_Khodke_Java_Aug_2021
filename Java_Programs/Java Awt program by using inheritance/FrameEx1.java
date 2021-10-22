//1.Java AWT example.To create frame by extending frame class.(Using Inheritance).
import java.awt.*;
class FrameEx1 extends Frame{
 public FrameEx1(){
  setSize(500,500);//set size of the frame (width,height)
  setVisible(true);//it set the visibility of the component (frame)
 }
public static void main(String args[]){
 FrameEx1 f=new FrameEx1();
 }
}


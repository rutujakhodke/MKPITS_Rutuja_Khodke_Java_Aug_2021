//2.Java AWT example.create a frame by creating the object of Frame class (Association).
import java.awt.*;
class FrameEx2{
 public FrameEx2(){//creating default constructor of the class
  Frame fr=new Frame();//creating object of Frame class
  fr.setSize(500,500);//(width,height)
  fr.setVisible(true);//it set the visibility of component
  }

  public static void main(String args[]){
  FrameEx2 f=new FrameEx2();
  }
}
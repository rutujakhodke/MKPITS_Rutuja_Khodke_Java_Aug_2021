//4.Java AWT example.To create a button inside frame.(By creating object of Frame class).
import java.awt.*;
class FrameEx4{
 public FrameEx4(){
  Frame fr=new Frame();
  fr.setSize(400,400);
  fr.setVisible(true);
  //creating button in frame
  Button b1=new Button("OK");
  b1.setBounds(140,100,110,50);//set the position of button (int x-axis,int y-axis,int width,int height)
  fr.add(b1);
  fr.setLayout(null);
  fr.setTitle("MKPITS Solutions");
  }
 public static void main(String args[]){
 FrameEx4 f=new FrameEx4();
 }
}


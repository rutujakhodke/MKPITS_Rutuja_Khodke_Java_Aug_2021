//3.Java Awt ToolKit Example.Change TitleBar Icon.
import java.awt.*;
public class ToolKitExample3{
 ToolKitExample3(){
   Frame f=new Frame("ToolKit Example");
   Image icon=Toolkit.getDefaultToolkit().getImage("Flipgrid_Logo_Icon.png");
   f.setIconImage(icon);
   f.setSize(300,300);
   f.setLayout(null);
   f.setVisible(true);
  }
   public static void main(String args[]){
   ToolKitExample3 tk=new ToolKitExample3();
 }
}
//5.Java AWT example.create a Login form.(by creating object of Frame class).
import java.awt.*;
class FrameEx5{
 public FrameEx5(){
  Frame fr=new Frame();
  fr.setSize(400,400);
  fr.setVisible(true);
  fr.setTitle("MKPITS  Solutions");
  fr.setLayout(null);
  //creating label in frame
  Label l1=new Label("MKPITS Solutions");
  l1.setBounds(140,50,110,50);
  fr.add(l1);

  Label l2=new Label("SignIn Please");
  l2.setBounds(150,80,100,50);
  fr.add(l2);

  Label l3=new Label("UserName :");
  l3.setBounds(80,130,100,30);
  fr.add(l3);
  //creating TextField in frame
  TextField t1=new TextField();
  t1.setBounds(180,130,200,25);
  fr.add(t1);

  Label l4=new Label("Password :");
  l4.setBounds(80,165,100,30);
  fr.add(l4);
  TextField t2=new TextField();
  t2.setBounds(180,165,200,25);
  fr.add(t2);

  //Creating Button in frame
  Button b1=new Button("Login");
  b1.setBounds(140,250,100,40);
  fr.add(b1);
 }
  public static void main(String args[]){
  FrameEx5 f =new FrameEx5();
 }
}
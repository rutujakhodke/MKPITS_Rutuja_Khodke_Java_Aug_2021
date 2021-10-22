//6.Java AWT example.Registration Form (By creating object of Frame class).
import java.awt.*;
class FrameEx6{
 public FrameEx6(){
  Frame fr=new Frame();
  fr.setSize(500,500);
  fr.setVisible(true);

  fr.setLayout(null);
  fr.setTitle("MKPITS Solutions");

  //creating label of form page title
  Label l1=new Label("SignUp  Form");
  l1.setBounds(190,50,100,80);
  fr.add(l1);

  //creating label for username in frame
  Label l2=new Label("UserName :");
  l2.setBounds(80,140,100,35);
  fr.add(l2);
  //creating textfield for username
  TextField t1=new TextField();
  t1.setBounds(200,140,200,30);
  fr.add(t1);

  //creating label for password in frame
  Label l3=new Label("Password :");
  l3.setBounds(80,190,100,35);
  fr.add(l3);
  //creating textfield for password
  TextField t2=new TextField();
  t2.setBounds(200,190,200,30);
  fr.add(t2);

  //creating label for email in frame
  Label l4=new Label("Email Id :");
  l4.setBounds(80,240,100,35);
  fr.add(l4);
  //creating textfield for emailId
  TextField t3=new TextField();
  t3.setBounds(200,240,200,30);
  fr.add(t3);

  //creating label for mobile no. in frame
  Label l5=new Label("Mobile Number :");
  l5.setBounds(80,290,100,35);
  fr.add(l5);
  //creating textfield for mobile no.
  TextField t4=new TextField();
  t4.setBounds(200,290,200,30);
  fr.add(t4);

  //creating button in frame
  Button b1=new Button("Register");
  b1.setBounds(170,350,90,40);
  fr.add(b1);
 }
   public static void main(String args[]){
   FrameEx6 f=new FrameEx6();
 }
}
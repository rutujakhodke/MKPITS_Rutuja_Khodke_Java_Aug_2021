//1.Java Awt Event Handling Example of Dialog box.
import java.awt.*;
public class MyDialogEx{
 public static void main(String args[]){
  Frame f=new Frame("My Frame");
  String title="Java Awt";
  boolean modal=true;
  Dialog d1=new Dialog(f,title,modal);

  Label l1=new Label("Do you want to close?");

  Button b1=new Button("Ok");

  Button b2=new Button("Cancel");

  f.setSize(300,300);
  f.setVisible(true);
  f.setTitle("Dialog Box Ex");

  d1.add(l1);
  d1.add(b1);
  d1.add(b2);
  d1.setSize(200,200);
  d1.setVisible(true);
 }
}
//21.Java Awt CheckBox example.
import java.awt.*;
class CheckboxEx2{
 public CheckboxEx2(){
 Frame f=new Frame("Checkbox Example");
 f.setSize(200,200);
 f.setVisible(true);
 f.setLayout(null);
 f.setTitle("Awt Checkbox");

 Checkbox cb1=new Checkbox("Male",false);
 cb1.setBounds(70,60,60,60);
 f.add(cb1);

 Checkbox cb2=new Checkbox("Female",true);
 cb2.setBounds(70,110,60,60);
 f.add(cb2);
 }
  public static void main(String args[]){
    new CheckboxEx2();
 }
}

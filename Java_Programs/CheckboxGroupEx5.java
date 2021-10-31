//5.Java Awt CheckboxGroup example.
import java.awt.*;
class CheckboxGroupEx5 extends Frame{
 CheckboxGroup cbg1;
 Checkbox cb1,cb2;
 public CheckboxGroupEx5(){
 Frame f=new Frame("CheckboxGroup Example");
  f.setSize(300,300);
  f.setVisible(true);
  f.setLayout(null);
  f.setTitle("CheckboxGroupEx");

  cbg1=new CheckboxGroup();
  cb1=new Checkbox("C++",cbg1,false);
  cb1.setBounds(50,100,70,70);
  f.add(cb1);

  cb2=new Checkbox("Java",cbg1,true);
  cb2.setBounds(160,100,70,70);
  f.add(cb2);
 }
 public static void main(String args[]){
 CheckboxGroupEx5 cbg=new CheckboxGroupEx5();
 }
}
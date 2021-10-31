//1.Java Awt CheckBox example.
import java.awt.*;
class CheckboxEx1{
 public CheckboxEx1(){
 Frame f=new Frame("Checkbox Example");
 f.setSize(300,300);
 f.setVisible(true);
 f.setLayout(null);
 f.setTitle("Awt Checkbox");

 //creating checkbox
 Checkbox cb1=new Checkbox("Python");
 cb1.setBounds(100,100,70,70);
 f.add(cb1);

 Checkbox cb2=new Checkbox("Java",true);
 cb2.setBounds(100,160,70,70);
 f.add(cb2);
 }
 public static void main(String args[]){
   new CheckboxEx1();
 }
}
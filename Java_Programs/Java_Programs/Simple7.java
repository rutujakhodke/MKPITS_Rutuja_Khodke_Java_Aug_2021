//3.example of private access modifier.
class A{
private int data=20;
private void msg(){
System.out.println("Hello java.");
 }
}
public class Simple6{
public static void main(String args[]){
A obj=new A();
System.out.println(obj.data);//error
obj.msg();//error
}
}

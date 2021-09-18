//6.example of java to invoke current class method with this keyword.
class A3{

void m(){
System.out.println("Hello m.");

}
void n(){

System.out.println("Hello n.");
//m();//same as this.m()
this.m();//calling m method from n method
 }
}
class TestThis5{
public static void main(String args[]){
A3 a1=new A3();
a1.n();
//a1.n();
 }
}
//15.Example of multiple inheritance which is not supported in java.
class A{
void msg(){
 System.out.println("Hello");
 }
}
class B{
void msg(){
System.out.println("Welcome");
 }
}
class C extends A,B{//error
public static void main(String args[]){
C.obj=new Obj();
obj.msg();//now which msg() method be invoked.
//compile time error.
 }
}
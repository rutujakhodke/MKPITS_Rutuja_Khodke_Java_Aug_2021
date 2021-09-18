//8.example of java with this keyword by calling default constructor from parametrized constructor.
class A4{

A4(){//default constructor.
System.out.println("Hello from default constructor.");
}
A4(int n){//parametrized constructor.
this();//calling default constructor from parametrized constructor.
System.out.println("Value of n is ="+n);
 }
}
class TestThisConstructorCall{
public static void main(String args[]){
A4 a=new A4(12);
 }
}
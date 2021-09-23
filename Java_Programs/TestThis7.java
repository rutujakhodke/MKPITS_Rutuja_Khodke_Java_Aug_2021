//13.example of java calling a parameterized constructor from a default constructor by using this keyword.
class A5{

A5(){
this(5);//calling parameterized constructor from default 
System.out.println("Hello from default constructor.");
}
A5(int n){
System.out.println("Number is ="+n);
 }
}
class TestThis7{
public static void main(String args[]){
A5 a1=new A5();//5
 }
}
//1.(function with no parameter and returning nothing (void)).wap to create a function sayhello() to print hello.
class TestFunction{
public static void sayHello(){
  System.out.println("Hello from sayHello function.");
}
public static void main(String args[]){
sayHello();
System.out.println("Calling the fuction sayhello.");
System.out.println("Again calling sayHello function.");
sayHello();
System.out.println("Exit from main Function.");
}
}
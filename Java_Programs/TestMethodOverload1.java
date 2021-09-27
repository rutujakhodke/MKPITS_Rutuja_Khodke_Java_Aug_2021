//2.example of method overloading.wap to to create a class and create a two static methods of same name but different parameters.so we don't need to create a instance for calling method.
class Adder{
public static int add(int a,int b){
 int result=a+b;
 return result;
 }
 public static int add(int a,int b,int c){
  int result=a+b+c;
  return result;
 }
}
class TestMethodOverload1{
public static void main(String args[]){
System.out.println(Adder.add(11,11));
System.out.println(Adder.add(11,11,11));
 }
}

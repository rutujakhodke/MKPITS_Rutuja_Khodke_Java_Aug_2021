//4.example of method overloading.wap to to create a class and create a two static methods of same name but different parameters.so we don't need to create a instance for calling method.
//(changing datatype of parameters)
class Adder{
 static int add(int n1,int n2){
 int result=n1+n2;
 return result;
 }
 static double add(double n1,double n2){
  double result=n1+n2;
  return result;
 }
}
class TestMethodOverload3{
public static void main(String args[]){
System.out.println(Adder.add(3,6));//it calls static method
System.out.println(Adder.add(12.4,5.8));
 }
}
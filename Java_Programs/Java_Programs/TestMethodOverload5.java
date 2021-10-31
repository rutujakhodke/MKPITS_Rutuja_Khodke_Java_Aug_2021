//6.method overloading is not possible by changing the return type of method only.
class Adder{
static int add(int a,int b){
 int result=a+b;
 return result;
 }
static double add(int a,int b){
 double result=a+b;
 return result;
 }
}
class TestMethodOverload5{
public static void main(String args[]){
System.out.println(Adder.add(12,15)); //compile time error
//here how can java determine which sum() method should be called?
 }
}
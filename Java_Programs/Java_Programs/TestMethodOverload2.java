//3.example of method overloading.wap to to create a class and create a two methods of same name but different parameters.
class Calculate{
 int addition(int n1,int n2){
  int result=n1+n2;
  return result;
 }
 int addition(int n1,int n2,int n3){
  int result=n1+n2+n3;
  return result;
 }
}
class TestMethodOverload2{
public static void main(String args[]){
Calculate c1=new Calculate();
int result=c1.addition(5,4);
System.out.println("Addition of a 2 Number is :"+result);
result=c1.addition(6,4,2);
System.out.println("Addition of a 3 Number is :"+result);
 }
}

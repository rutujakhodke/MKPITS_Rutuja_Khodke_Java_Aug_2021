//1.example of method overloading.wap to to create a class and create a two methods of same name but different parameters.(changing no. of parameters)
class Calculate{
 void add(int n1,int n2){
 int result=n1+n2;
 System.out.println("Addition of a 2 Number is ="+result);
 }
 void add(int n1,int n2,int n3){
 int result=n1+n2+n3;
 System.out.println("Addition of a 3 Number is ="+result);
 }
}
class TestMethodOverload{
public static void main(String args[]){
Calculate c1=new Calculate();
c1.add(2,3);
c1.add(3,4,5);
}
}
//5.wap to to create a class and create a 3 methods of same name but different parameters.(changing datatype of parameters).
class Calculate{
 public int addition(int n1,int n2){
 int res=n1+n2;
 return res;
 }
 public float addition(float n1,float n2){
 float res1=n1+n2;
 return res1;
 }
 public double addition(double n1,double n2){
  double res2=n1+n2;
  return res2;
 }
}
class TestMethodOverload4{
public static void main(String args[]){
Calculate c1=new Calculate();
int res=c1.addition(8,3);
System.out.println("Addition of a 2 Integer Number is ="+res);
float res1=c1.addition(3.8f,2.9f);
System.out.println("Addition of a 2 Float Number is ="+res1);
double res2=c1.addition(22.145,13.98);
System.out.println("Addition of a 2 Double Number is ="+res2);
 }
}
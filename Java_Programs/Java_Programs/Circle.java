//1.Example of Aggregation.we have created the reference of Operation class in the circle class.
class Operation{
int square(int num){
 return num*num;
 }
}
class Circle{
 Operation op;//aggregation (syntax-class name reference name).
 double pi=3.14;
 int radius;

 double area(int radius){
 op=new Operation();//object of Operation class
  int squareValue=op.square(radius);
  return pi*squareValue;
 }
public static void main(String args[]){
Circle c=new Circle();
double result=c.area(5);
System.out.println(result);
 }
}

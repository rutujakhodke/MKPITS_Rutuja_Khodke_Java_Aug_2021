//4.Example of Aggregation.we have created the reference of BasicOp class in the Rectangle class.
class BasicOp{
 int multiply(int n,int m){
  return n*m;
 }
}
class Rectangle{
 int length;
 int breadth;
 BasicOp basicop;//aggregation

 float areaOfRectangle(int length,int breadth){
  BasicOp op1=new BasicOp();
  int rectArea=op1.multiply(length,breadth);
  return length*breadth;
 }
}
class TestAggregation1{
public static void main(String args[]){
Rectangle r1=new Rectangle();
float result=r1.areaOfRectangle(4,3);
System.out.println(result);
 }
}
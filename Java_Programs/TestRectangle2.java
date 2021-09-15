//4.wap of java to illustrate the use of rectangle class by creating multiple objects by one type only.
class Rectangle{
 int length;
 int breadth;//initalization of primitive variables

 void insert(int l,int b){
  length=l;
  breadth=b;
  }
   void calculateArea(){System.out.println(length*breadth);}
}

 class TestRectangle2{
  public static void main(String args[]){
  Rectangle r1=new Rectangle(),r2=new Rectangle(),r3=new Rectangle();//creating 3 objects of same type rectangle.
  r1.insert(7,9);
  r2.insert(11,8);
  r3.insert(22,5);
  r1.calculateArea();
  r2.calculateArea();
  r3.calculateArea();
  }
 }

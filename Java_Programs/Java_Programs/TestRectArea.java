//1.Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim' takes length and breadth of rectangle as parameters
//and the second method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
class Area{
 int length;
 int breadth;

 public void setDim(int length,int breadth){
  this.length=length;
  this.breadth=breadth;
 }
 public float getArea(){
  return length*breadth;
 }
}
class TestRectArea{
public static void main(String[] args){
java.util.Scanner scan=new java.util.Scanner(System.in);
System.out.println("Enter a Length of Rectangle :");
int length=scan.nextInt();
System.out.println("Enter a Breadth of Rectangle :");
int breadth=scan.nextInt();

Area a1=new Area();
a1.setDim(length,breadth);
float areaOfRectangle=a1.getArea();
System.out.println("Area of Rectangle is ="+areaOfRectangle);
 }
}
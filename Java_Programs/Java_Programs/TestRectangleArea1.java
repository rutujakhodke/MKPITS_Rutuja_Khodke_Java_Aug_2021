//7.Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length and breadth as parameters of its constructor
//and having a method named 'returnArea' which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
class Area{
int length;
int breadth;

public Area(int length,int breadth){//parametrized constructor
 this.length=length;
 this.breadth=breadth;
}
public double returnArea(){
  double rectArea=length*breadth;
  return rectArea;
 }
}
class TestRectangleArea1{
public static void main(String[] args){
java.util.Scanner scan=new java.util.Scanner(System.in);
System.out.println("Enter a Length of a Rectangle :");
int length=scan.nextInt();
System.out.println("Enter a Breadth of a Rectangle :");
int breadth=scan.nextInt();

Area a1=new Area(length,breadth);//calling parametrized constructor
double rectArea=a1.returnArea();
System.out.println("Area of a Rectangle is ="+rectArea);
 }
}
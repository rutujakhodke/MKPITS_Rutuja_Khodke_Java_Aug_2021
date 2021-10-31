//10.(Function with parameters and returning nothing(void)).wap to create a method calarea with one int parameter to accept radius .calculate and display area and circumference of circle.
import java.util.*;
class Circle{

public void calculateArea(int radius){
 double area=3.14*radius*radius;
 System.out.println("Area Of a Circle is ="+area);
}
public void calculateCirc(int radius){
 double circumference=2*3.14*radius;
 System.out.println("Circumference of a Circle is ="+circumference);
 }
}
class TestCircleArea{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter a radius of a circle :");
int radius=s.nextInt();

Circle c=new Circle();
c.calculateArea(radius);
c.calculateCirc(radius);
 }
}
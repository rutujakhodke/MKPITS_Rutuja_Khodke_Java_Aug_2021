//1.create a parent class figure and child class triangle having same method in child class as declared in parent class.
class Figure{
void draw(){
 System.out.println("draw method of Figure class.");
 }
}
class Triangle extends Figure{
void draw(){
 System.out.println("draw method of Triangle class.");
 }
}
class TestMethodOverr1{
public static void main(String args[]){
Figure f=new Figure();//create a instance of parent class
f.draw();
Triangle t=new Triangle();//create a instance of child class
t.draw();
 }
}
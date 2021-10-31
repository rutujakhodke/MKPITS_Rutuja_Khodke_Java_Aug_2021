//7.java program to get the cube of a given number using the static method(main method inside another class).
class Calculate{
  static int cube(int n){
  return n*n*n;
 }
}

class TestCalculate{
public static void main(String args[]){

 int result=Calculate.cube(3);//provide class name and then static method name.
 System.out.println("Cube is ="+result);
 }
}
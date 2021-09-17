//6.java program to get the cube of a given number using the static method.
class Calculate2{
 static int cube(int n){
  return n*n*n;
 }

 public static void main(String args[]){
 int result=Calculate2.cube(2);//calling method using classname.
 System.out.println("Cube is ="+result);
 }
}

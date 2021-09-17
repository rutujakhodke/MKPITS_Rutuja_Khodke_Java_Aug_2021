//5.example without static method.
class Calculate{
 int cube(int n){
   return n*n*n;

 }
 public static void main(String args[]){
 Calculate c1=new Calculate();
 int result=c1.cube(3);//calling method through reference variable.
 System.out.println("Cube ="+result);
}
}
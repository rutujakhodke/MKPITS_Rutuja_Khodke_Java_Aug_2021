//4.(Function with parameters and returning nothing(void)).wap to create a function square with one int parameter  and calculate and display the square of that no.
class Function2{
 int num;
 int square;
 public void square(int num){
  square=num*num;
  System.out.println("Square of a " +num+ " is = "+square);
 }
}
class TestMethod2{
public static void main(String args[]){
Function2 f2=new Function2();
int num=3;
f2.square(num);
}
}
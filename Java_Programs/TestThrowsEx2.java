//3.Example of Java Throws Keyword in Exception Handling.The checked exceptions can be propagated by throws keyword.
import java.io.IOException;
class Test{
 void m() throws IOException{
  throw new IOException("Device Error..");//checked exception
  }
  void n() throws IOException {
    m();
  }
  void p(){//it handles the exception
    try{
        n();
  }catch(Exception e){
    System.out.println("Exception Handled..");
   }
  }
}
public class TestThrowsEx2{
 public static void main(String args[]){
 Test t=new Test();
 t.p();
 System.out.println("Normal flow of the Program...");
 }
}

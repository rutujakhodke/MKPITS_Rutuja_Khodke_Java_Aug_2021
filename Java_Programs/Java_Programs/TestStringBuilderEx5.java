//4.Java StringBuilder class method example.(delete(int startIndex,int endIndex)).
public class TestStringBuilderEx5{
  public static void main(String args[]){
  StringBuilder sb=new StringBuilder("Welcome");
  sb.delete(1,4);
  System.out.println(sb);
 }
}
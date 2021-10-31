//4.Java StringBuilder class method example.(replace(int beginIndex,int endIndex,String str)).
public class TestStringBuilderEx4{
 public static void main(String args[]){
 StringBuilder sb=new StringBuilder("Welcome");
 sb.replace(3,5,"Java");
 System.out.println("Replace String is ="+sb);
 }
}

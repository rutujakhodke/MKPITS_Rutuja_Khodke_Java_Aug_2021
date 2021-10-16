//1.Example of StringTokenizer.The StringTokenizer class that tokenizes a string on the basis of whitespace.
import java.util.StringTokenizer;
public class TestStringTokenizerEx1{
 public static void main(String args[]){
 StringTokenizer st=new StringTokenizer("My name is MKPITS"," ");
  while(st.hasMoreTokens()){
   System.out.println(st.nextToken());
  }
 }
}
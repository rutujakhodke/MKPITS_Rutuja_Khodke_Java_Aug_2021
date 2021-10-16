//2.Example of StringTokenizer.
import java.util.StringTokenizer;
public class TestStringTokenizerEx2{
  public static void main(String args[]){
  StringTokenizer st=new StringTokenizer("My .name .is .Rashi",".");
   while(st.hasMoreTokens()){
   System.out.println(st.nextToken());
   }
 }
}
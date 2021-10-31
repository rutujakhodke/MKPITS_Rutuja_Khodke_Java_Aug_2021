//3.Example of StringTokenizer class of  nextToken() method.
import java.util.*;
public class TestStringTokenizerEx3{
  public static void main(String args[]){
  StringTokenizer st=new StringTokenizer("My,name,is,Rashi");
  //printing next token
  System.out.println("Next Token is ="+st.nextToken(","));
 }
}
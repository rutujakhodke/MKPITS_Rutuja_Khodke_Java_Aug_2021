//4.Example of StringTokenizer class.
import java.util.*;
public class TestStringTokenizerEx4{
  public static void main(String args[]){
  String str="Welcome to Java Programming";
  String arr[]=new String[4];
  StringTokenizer st=new StringTokenizer(str," ");
  int i=0;
   while(st.hasMoreTokens()){
    arr[i]=st.nextToken();
    i++;
   }
  for(i=0;i<4;i++){
  System.out.println(arr[i]);
  }
 }
}
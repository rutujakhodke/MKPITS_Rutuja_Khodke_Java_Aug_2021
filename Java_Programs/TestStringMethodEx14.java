//15.Java String class method.(String[] split(String regex,int limit)).
public class TestStringMethodEx14{
  public static void main(String args[]){
  String name="Mayuri,Rashi,Sima,Rima";
  String[] arr=name.split(",",2);
  for(String s:arr)
  System.out.println(s);
 }
}

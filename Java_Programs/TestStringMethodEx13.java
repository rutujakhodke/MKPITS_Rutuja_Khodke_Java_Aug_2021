//14.Java String class method.(String[] split (String regex)).
public class TestStringMethodEx13{
  public static void main(String args[]){
   String name="Mayuri,Rashi,Sima";
   String[] arr=name.split(",");
    for(String s:arr)
    System.out.println(s);
 }
}
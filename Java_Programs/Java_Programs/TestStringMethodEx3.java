//5.Java String class Method.(length()).
public class TestStringMethodEx3{
  public static void main(String args[]){
  String company=new String("MKPITSsolutions");
  for(int i=0;i<company.length();i++){
   char ch=company.charAt(i);
   System.out.print("-"+ch);
   }
  }
}
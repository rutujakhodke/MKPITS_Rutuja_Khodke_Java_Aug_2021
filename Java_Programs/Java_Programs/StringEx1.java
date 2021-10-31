//2.Java String Example.
public class StringEx1{
 public static void main(String args[]){
 String s1="Java";//creating a string by java string literal
 char[] ch={'s','t','r','i','n','g','s'};
 String s2=new String(ch);//converting char array into string
 String s3=new String("JavaString");//creating a string by new keyword
 System.out.println(s1);
 System.out.println(s2);
 System.out.println(s3);
 }
}
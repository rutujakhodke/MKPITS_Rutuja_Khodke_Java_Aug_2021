//10.Java StringBuffer class method.(capacity() method).
public class StringBufferEx10{
  public static void main(String args[]){
  StringBuffer sb=new StringBuffer();
  System.out.println(sb.capacity());//default capacity is 16
  sb.append("Welcome");
  System.out.println(sb.capacity());//current capacity is 16
  sb.append("Java is a easy language");
  System.out.println(sb.capacity());//now capacity is (16*2)+2=34 i.e(oldcapacity*2)+2
 }
}
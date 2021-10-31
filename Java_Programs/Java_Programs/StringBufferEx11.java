//11.Java StringBuffer class method.(ensureCapacity() method).
public class StringBufferEx11{
  public static void main(String args[]){
  StringBuffer sb=new StringBuffer();
  System.out.println(sb.capacity());//default capacity is 16
  sb.append("Hello");
  System.out.println(sb.capacity());//its current capacity is 16
  sb.append("Java is a easy language");
  System.out.println(sb.capacity());//its capacity is (16*2)+2=34
  sb.ensureCapacity(10);//no change
  System.out.println(sb.capacity());//its current capacity is 34
  sb.ensureCapacity(50);//capacity is (34*2)+2=70
  System.out.println(sb.capacity());
 }
}

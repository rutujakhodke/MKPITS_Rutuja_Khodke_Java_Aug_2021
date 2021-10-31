//7.Java StringBuilder class method example.(ensureCapacity()).
public class TestStringBuilderEx8{
  public static void main(String args[]){
  StringBuilder sb=new StringBuilder();
  System.out.println(sb.capacity());//default capacity is 16
  sb.append("Hello");
  System.out.println(sb.capacity());//current capacity is 16
  sb.append("Java is popular language");
  System.out.println(sb.capacity());//now (16*2)+2=34 i.e.(oldcapacity*2)+2
  sb.ensureCapacity(10);
  System.out.println(sb.capacity());//capacity is 34
  sb.ensureCapacity(60);
  System.out.println(sb.capacity());//capacity is =(34*2)+2=70
 }
}

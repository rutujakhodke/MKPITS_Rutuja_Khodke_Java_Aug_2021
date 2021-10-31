//6.Java StringBuilder class method example.(capacity())
public class TestStringBuilderEx7{
  public static void main(String args[]){
  StringBuilder sb=new StringBuilder();
  System.out.println(sb.capacity());//default capacity is 16
  sb.append("Hello");
  System.out.println(sb.capacity());//current capacity is 16
  sb.append("Java is a popular language");
  System.out.println(sb.capacity());//now (16*2)+2=34 i.e.(oldcapacity*2)+2
  }
}
//1.Java StringBuffer class method.(append()).
public class StringBufferEx1{
 public static void main(String args[]){
 StringBuffer sb=new StringBuffer("Hello ");
 sb.append("StringBuffer Class");//now original string is changed
 System.out.println(sb);
 }
}
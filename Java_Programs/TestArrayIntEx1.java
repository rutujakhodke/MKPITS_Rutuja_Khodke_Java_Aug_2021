//1.Wap to create an integer array of 3 elements to store 3 no. then display the value stored in an array in Java.
public class TestArrayIntEx1{
 public static void main(String[] args){
  int[] num=new int[3];
  num[0]=2;
  num[1]=4;
  num[2]=6;
  //trverse the array elements
  for(int i=0;i<num.length;i++){
	  System.out.println(num[i]);
	}
  }
}
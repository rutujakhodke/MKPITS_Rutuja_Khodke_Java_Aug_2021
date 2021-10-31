//1.Java program of array,how to declare,instantiate,initaialize and traverse the java array.
class TestArrayEx1{
 public static void main(String args[]){
  int a[] = new int[5];//declare and instantiate the array
   a[0]=10;//initialize the array
   a[1]=20;
   a[2]=30;
   a[3]=40;
   a[4]=50;
   //traverse the array
   for(int i=0;i<a.length;i++)//length is the property of array
   System.out.println(a[i]);
  }
}
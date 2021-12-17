//1.Create a Array of 3 elements and pass it to the method display to display the elements of an array
public class ArraytoMethodEx1 {
//parameter is array
void  display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int a[]={1,2,3};
        ArraytoMethodEx1 array=new ArraytoMethodEx1();
        array.display(a);//passing array to method
    }
}

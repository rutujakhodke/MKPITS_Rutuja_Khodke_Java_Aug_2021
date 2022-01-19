import java.util.Arrays;

public class ParallelSort {
    public static void main(String[] args){
        int numbers[]={22,89,1,32,19,5};
        //parallel sort method for sorting int array
        Arrays.parallelSort(numbers,1,3);
        for(int x:numbers){
            System.out.println(x);
        }
    }
}

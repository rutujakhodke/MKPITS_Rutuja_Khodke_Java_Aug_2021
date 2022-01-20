import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx3 {
    public static void main(String[] args){
        ArrayList<Integer> obj1=new ArrayList<Integer>();//using arraylist class
        ArrayList<Integer> obj2=new ArrayList<Integer>();
        obj1.add(20);
        obj1.add(2);
        obj1.add(23);
        obj1.add(12);
        obj1.add(30);
        System.out.println(obj1);

       List<Integer> collectvalue = obj1.stream().map(m -> m+5).collect(Collectors.toList());//using stream class
       System.out.println(collectvalue);

       //        for(Integer integer :obj1){
      //                obj2.add(integer+5);
//        }
//        System.out.println(obj2);
    }
}

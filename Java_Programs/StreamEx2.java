import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx2 {
    public static void main(String[] args){
        ArrayList<Integer> obj1=new ArrayList<Integer>();
        ArrayList<Integer> obj2=new ArrayList<Integer>();
        obj1.add(20);
        obj1.add(2);
        obj1.add(23);
        obj1.add(12);
        obj1.add(30);
        System.out.println(obj1);

        List<Integer> collectvalue= obj1.stream().filter(e -> e%2==0).collect(Collectors.toList());//e-lambda function
         System.out.println(collectvalue);

//        List<Integer> collectvalue1= obj1.stream().filter(m -> m%2==0).collect(Collectors.toList());
//        System.out.println(collectvalue1);

//        for(Integer integer :obj1){
//            if(integer % 2 == 0) {
//                obj2.add(integer);
//            }
//        }
//        System.out.println(obj2);
    }
}

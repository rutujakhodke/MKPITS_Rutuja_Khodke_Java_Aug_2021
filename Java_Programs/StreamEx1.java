import java.util.ArrayList;

public class StreamEx1 {
    public static void main(String[] args){
        ArrayList<Integer> obj1=new ArrayList<Integer>();
        ArrayList<Integer> obj2=new ArrayList<Integer>();//this arraylist will print the even nos.from first arraylist
        obj1.add(20);
        obj1.add(2);
        obj1.add(23);
        obj1.add(12);
        obj1.add(30);
        System.out.println(obj1);

        for(Integer integer :obj1){
            if(integer % 2 == 0) {
                obj2.add(integer);
            }
        }
          System.out.println(obj2);
    }
}

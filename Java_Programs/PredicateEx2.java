import java.util.function.Predicate;

public class PredicateEx2 {
    public static void main(String[] args){
        Predicate<Integer> predicateobj = new Predicate<Integer>() {
            @Override
            public boolean test(Integer t) {
                System.out.println(t);
                return true;
            }
        };
        boolean test =predicateobj.test(200);
        System.out.println(test);

        //lambda function
//        Predicate<Integer> predicateobj1 = ar -> ar>100;
//        boolean test= predicateobj1.test(200);//it will print true
//        System.out.println(test);
    }
}

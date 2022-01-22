import java.util.function.Predicate;

public class PredicateEx4 {
    public static void main(String[] args){
        //lambda expression
        Predicate<Integer> prdicateobj = ar -> ar>5;
        Predicate<Integer> prdicateobj1 = ar -> ar==200;
        Predicate<Integer> or = prdicateobj.or(prdicateobj1);//predicate and operator

        boolean test= or.test(4);
        System.out.println(test);
    }
}

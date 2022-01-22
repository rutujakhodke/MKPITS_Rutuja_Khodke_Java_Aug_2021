import java.util.function.Predicate;

public class PredicateEx3 {
    public static void main(String[] args){
        //lambda expression
        Predicate<Integer> prdicateobj = ar -> ar>100;
        Predicate<Integer> prdicateobj1 = ar -> ar<200;
        Predicate<Integer> and = prdicateobj.and(prdicateobj1);//predicate and operator

        boolean test= and.test(118);
        System.out.println(test);
    }
}

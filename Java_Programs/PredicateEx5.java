import java.util.function.Predicate;

public class PredicateEx5 {
    public static void main(String args[]){
        //lambda function
        Predicate<Integer> predicateobj =ar -> ar>5;
        Predicate<Integer> negate =predicateobj.negate();

        boolean test =negate.test(4);
        System.out.println(test);
    }
}

import java.util.function.Predicate;

public class PredicateEx1 {
    public static void main(String[] args){
        Predicate<Integer> predicateobj = new Predicate<Integer>() {
            @Override
            public boolean test(Integer t) {
                System.out.println(t);
                return true;
            }
        };
    }
}

import java.util.Optional;

public class NullPointerEx3 {
    public static void main(String args[]){
        Optional<String> nonemptyOptional=Optional.of("Java");
        Optional<String> emptyOptional=Optional.empty();
        //orElseThrow()-Return the contained value if present,otherwise
        //throw an exception to be created by the provided supplier

        System.out.println(nonemptyOptional.orElseThrow(NullPointerException::new));//Java
        System.out.println(emptyOptional.orElseThrow(NullPointerException::new));//nullPointerException

    }
}

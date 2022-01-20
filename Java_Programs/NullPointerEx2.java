
import java.util.Locale;
import java.util.Optional;

public class NullPointerEx2 {
    public static void main(String[] args){
        String s[]=new String[5];
        s[0]="ram";
        s[1]="shyam";
        Optional<String> empty=Optional.empty();
        System.out.println(empty);//it will create an empty Optional object

        //second way
        Optional<String>obj1=Optional.of(s[0]);
        System.out.println(obj1);//it will print the object with string name.the arguments passed to the of() method can't be null.

        //third way
        Optional<String>obj2=Optional.ofNullable(s[0]);
        System.out.println(obj2);//in case we expect some null values ,we can use ofNullable() method.it will print null value.

       System.out.println(obj2.get());//it return the value of String object.

        Optional<String>obj3=Optional.ofNullable(s[2]);
        System.out.println(obj3);
        System.out.println(obj3.isPresent());//it checks the string value present in Optional object or not
       // System.out.println(obj2.isEmpty());

    }
}




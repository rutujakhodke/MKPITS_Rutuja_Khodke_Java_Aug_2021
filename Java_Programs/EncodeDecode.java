import java.nio.charset.StandardCharsets;
import java.util.Base64;

class Test{
   //String password="rutuja@098";
    byte[] encodeFunc(String name){
        byte[] encode= Base64.getEncoder().encode(name.getBytes(StandardCharsets.UTF_8));
        return encode;

    }
    String decodeFunc(byte[] encodedata){
        byte[] decode=Base64.getDecoder().decode(encodedata);
        return new String(decode);
    }
}
public class EncodeDecode {
    public static void main(String[] args){
        Test obj1=new Test();
        byte[] encodevalue=obj1.encodeFunc("rutuja");
        String decodevalue=obj1.decodeFunc(encodevalue);

        System.out.println("encoded data is "+ encodevalue);
        System.out.println("decoded data is "+ decodevalue);

    }
}


import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Encoder {
    public static void main(String[] args){
        String pass="rutuja@098";
        byte[] encode= Base64.getEncoder().encode(pass.getBytes(StandardCharsets.UTF_8));
        System.out.println(encode);

        byte[] decode=Base64.getDecoder().decode(encode);
        System.out.println(new String(decode));
    }
}

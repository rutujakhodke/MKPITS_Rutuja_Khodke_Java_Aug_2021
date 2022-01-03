import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkEx1 {
    public static void main(String args[]) throws UnknownHostException {
        InetAddress obj=InetAddress.getLocalHost();//it can return name of computer and its IP address
        System.out.println(obj);

        System.out.println(obj.getHostAddress());//it will print IP address of a system

        System.out.println(obj.getHostName());//it will print name of a system

        System.out.println(obj.getByName("www.google.com"));//it will print IP address of a website

        System.out.println(obj.getLoopbackAddress());//it will return loop back address

       


    }
}

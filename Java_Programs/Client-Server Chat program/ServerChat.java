
import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerChat {
public static void main(String args[]) {
    try {
        ServerSocket ssobj = new ServerSocket(6000);
        System.out.println("Waiting for client to connect..");

        Socket s = ssobj.accept();
        System.out.println("Client connected..");

        for(; ;){//infinite for loop
            DataInputStream dis=new DataInputStream(s.getInputStream());//to read data from client
            String str=dis.readLine();
            System.out.println("Client: "+ str);

            PrintStream ps=new PrintStream(s.getOutputStream());//to write data on server
            DataInputStream dis1=new DataInputStream(System.in);
            String str1=dis1.readLine();
            ps.println(str1);
            if(str1.equals("Bye")){
                System.exit(0);
                dis.close();
                dis1.close();
                ps.close();
                s.close();
                ssobj.close();
            }
        }

    }catch (Exception e){

    }

}
}

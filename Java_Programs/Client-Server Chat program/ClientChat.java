import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.sql.DatabaseMetaData;

public class ClientChat {
    public static void main(String[] args){
        try{
            Socket s=new Socket("localhost",6000);
            System.out.println("Client is sending request");

            for(; ;){
                DataInputStream dis=new DataInputStream(System.in);
                String str=dis.readLine();
                PrintStream ps=new PrintStream(s.getOutputStream());
                ps.println(str);

                DataInputStream dis1=new DataInputStream(s.getInputStream());
                String str1=dis1.readLine();
                System.out.println("Server: " +str1);
                if(str.equals("Bye")){
                    System.exit(0);
                    dis.close();
                    dis1.close();
                    ps.close();
                    s.close();
                }
            }
        }catch (Exception e){

        }
    }
}

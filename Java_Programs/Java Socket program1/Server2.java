package network;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2{
    public static void main(String[] args){
        try{
            ServerSocket ssobj=new ServerSocket(6000);
            System.out.println("Waiting for client to connect..");

            Socket s=ssobj.accept();//establishes the connection
            System.out.println("Client connected..");
            DataInputStream dis=new DataInputStream(s.getInputStream());
            String str=(String) dis.readUTF();
            System.out.println("message ="+str);
            ssobj.close();
        }catch (Exception e){
        }
    }
}


package network;

import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
    public static void main(String[] args){
        try{
        ServerSocket ssobj=new ServerSocket(6000);
        System.out.println("Waiting for client to connect..");

            Socket s=ssobj.accept();//establishes the connection
            System.out.println("Client connected..");
    }catch (Exception e){
        }
    }
}
